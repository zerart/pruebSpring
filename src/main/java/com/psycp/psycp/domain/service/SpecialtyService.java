package com.psycp.psycp.domain.service;

import com.psycp.psycp.domain.Specialty;
import com.psycp.psycp.domain.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialtyService {
    @Autowired
    private SpecialtyRepository specialtyRepository;

    public List<Specialty> getAll(){
        return specialtyRepository.getAll();
    }
    public Optional<Specialty> getSpecialty(int specialtyId){
        return specialtyRepository.getSpecialty(specialtyId);
    }
    public Optional<List<Specialty>> getBySpecialtyGroup(int specialtyGroupId){
        return  specialtyRepository.getBySpecialtyGroup(specialtyGroupId);
    }

    public Specialty save(Specialty specialty){
        return specialtyRepository.save(specialty);
    }
    public boolean delete(int specialtyId)
    {
        return getSpecialty(specialtyId).map(specialty -> {
           specialtyRepository.delete(specialtyId);
           return true;
        }).orElse(false);
    }

}
