package com.psycp.psycp.web.controller;


import com.psycp.psycp.domain.SpecialtyDTO;
import com.psycp.psycp.domain.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/specialtys")
public class SpecialtyController {
    @Autowired
    private SpecialtyService specialtyService;


    public List<SpecialtyDTO> getAll(){
        return specialtyService.getAll();
    }

    public Optional<SpecialtyDTO> getSpecialtyDTO(int specialtyId){
        return specialtyService.getSpecialtyDTO(specialtyId);
    }

    public Optional<List<SpecialtyDTO>> getBySpecialtyGroupDTO(int specialtyGroupId){
        return  specialtyService.getBySpecialtyGroupDTO(specialtyGroupId);
    }

    public SpecialtyDTO save(SpecialtyDTO specialtyDTO){
        return specialtyService.save(specialtyDTO);
    }
    public boolean delete(int specialtyId)
    {
        return specialtyService.delete(specialtyId);
    }
}

