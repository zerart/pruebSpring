package com.psycp.psycp.domain.service;

import com.psycp.psycp.domain.SpecialtyDTO;
import com.psycp.psycp.domain.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialtyService {
    @Autowired
    private SpecialtyRepositoryDTO specialtyRepositoryDTO;

    public List<SpecialtyDTO> getAll(){
        return specialtyRepositoryDTO.getAll();
    }
    public Optional<SpecialtyDTO> getSpecialtyDTO(int specialtyId){
        return specialtyRepositoryDTO.getSpecialtyDTO(specialtyId);
    }
    public Optional<List<SpecialtyDTO>> getBySpecialtyGroupDTO(int specialtyGroupId){
        return  specialtyRepositoryDTO.getBySpecialtyGroupDTO(specialtyGroupId);
    }

    public SpecialtyDTO save(SpecialtyDTO specialty){
        return specialtyRepositoryDTO.save(specialty);
    }
    public boolean delete(int specialtyId)
    {
        return getSpecialtyDTO(specialtyId).map(specialtyDTO -> {
           specialtyRepositoryDTO.delete(specialtyId);
           return true;
        }).orElse(false);
    }

}
