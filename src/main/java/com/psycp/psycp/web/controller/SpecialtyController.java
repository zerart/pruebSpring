package com.psycp.psycp.web.controller;


import com.psycp.psycp.domain.Specialty;
import com.psycp.psycp.domain.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/specialtys")
public class SpecialtyController {
    @Autowired
    private SpecialtyService specialtyService;

    @GetMapping("/all")
    public ResponseEntity<List<Specialty>> getAll() {
        return new ResponseEntity<>(specialtyService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{specialtyId}")
    public Optional<Specialty> getSpecialty(@PathVariable("specialtyId") int specialtyId) {
        return specialtyService.getSpecialty(specialtyId);
    }

    @GetMapping("/{specialtyGroupId}")
    public Optional<List<Specialty>> getBySpecialtyGroup(@PathVariable("specialtyGroupId") int specialtyGroupId) {
        return specialtyService.getBySpecialtyGroup(specialtyGroupId);
    }

    @PostMapping("/save")
    public Specialty save(@RequestBody Specialty specialty) {
        return specialtyService.save(specialty);
    }

    @DeleteMapping("/delete/specialtyId")
    public boolean delete(@PathVariable("specialtyId") int specialtyId) {
        return specialtyService.delete(specialtyId);
    }
}

