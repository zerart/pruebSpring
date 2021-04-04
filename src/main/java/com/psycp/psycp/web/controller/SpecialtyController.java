package com.psycp.psycp.web.controller;


import com.psycp.psycp.domain.Specialty;
import com.psycp.psycp.domain.service.SpecialtyService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/specialties")
public class SpecialtyController {
    @Autowired
    private SpecialtyService specialtyService;

    @GetMapping("/all")
    @ApiOperation("Muestra todas las especialidades registradas")
    @ApiResponse(code=200, message = "Ok")
    public ResponseEntity<List<Specialty>> getAll() {
        return new ResponseEntity<>(specialtyService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{specialtyId}")
    public ResponseEntity<Specialty> getSpecialty(@PathVariable("specialtyId") int specialtyId) {
        return specialtyService.getSpecialty(specialtyId).map(specialty -> new ResponseEntity<>(specialty,HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{specialtyGroupId}")
    public ResponseEntity<List<Specialty>> getBySpecialtyGroup(@PathVariable("specialtyGroupId") int specialtyGroupId) {
        return specialtyService.getBySpecialtyGroup(specialtyGroupId).map(specialties -> new ResponseEntity<>(specialties,HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Specialty> save(@RequestBody Specialty specialty) {
        return new ResponseEntity<>(specialtyService.save(specialty),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/specialtyId")
    public ResponseEntity delete(@PathVariable("specialtyId") int specialtyId) {
        if(specialtyService.delete(specialtyId)){
            return new ResponseEntity(HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}

