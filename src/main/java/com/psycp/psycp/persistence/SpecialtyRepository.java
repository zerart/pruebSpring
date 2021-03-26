package com.psycp.psycp.persistence;

import com.psycp.psycp.domain.SpecialtyDTO;
import com.psycp.psycp.persistence.crud.SpecialtyCrudRepository;
import com.psycp.psycp.persistence.entity.Specialty;
import com.psycp.psycp.persistence.mapper.SpecialtyMapper;
import com.psycp.psycp.domain.repository.SpecialtyRepositoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SpecialtyRepository implements SpecialtyRepositoryDTO {

    @Autowired
    private SpecialtyCrudRepository specialtyCrudRepository;
    @Autowired
    private SpecialtyMapper mapper;

    @Override
    public List<SpecialtyDTO> getAll() {
        List<Specialty> specialtys = (List<Specialty>) specialtyCrudRepository.findAll();
        return mapper.toSpecialtysDTO(specialtys);
    }
    @Override
    public Optional<List<SpecialtyDTO>> getBySpecialtyGroupDTO(int specialtyGroupDTOId) {
        List<Specialty> specialtys = specialtyCrudRepository.findBySpecialtyGroupId(specialtyGroupDTOId);
        return Optional.of(mapper.toSpecialtysDTO(specialtys));
    }


    @Override
    public Optional<SpecialtyDTO> getSpecialtyDTO(int specialtyDTOId)
    {
        return specialtyCrudRepository.findById(specialtyDTOId).map(specialty -> mapper.toSpecialtyDTO(specialty));
    }
    @Override
    public SpecialtyDTO save(SpecialtyDTO specialtyDTO)
    {
        Specialty specialty = mapper.toSpecialty(specialtyDTO);
        return mapper.toSpecialtyDTO(specialtyCrudRepository.save(specialty));
    }
    @Override
    public void delete(int specialtyDTOId)
    {
        specialtyCrudRepository.deleteById(specialtyDTOId);
    }

}
