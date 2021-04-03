package com.psycp.psycp.persistence;

import com.psycp.psycp.domain.Specialty;
import com.psycp.psycp.persistence.crud.SpecialtyCrudRepository;
import com.psycp.psycp.persistence.entity.SpecialtyEntity;
import com.psycp.psycp.persistence.mapper.SpecialtyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SpecialtyRepository implements com.psycp.psycp.domain.repository.SpecialtyRepository {

    @Autowired
    private SpecialtyCrudRepository specialtyCrudRepository;
    @Autowired
    private SpecialtyMapper mapper;

    @Override
    public List<Specialty> getAll() {
        List<SpecialtyEntity> specialtyEntities = (List<SpecialtyEntity>) specialtyCrudRepository.findAll();
        return mapper.toSpecialties(specialtyEntities);
    }
    @Override
    public Optional<List<Specialty>> getBySpecialtyGroup(int specialtyGroupId) {
        List<SpecialtyEntity> specialtyEntities = specialtyCrudRepository.findBySpecialtyGroupEntitySpecialtyGroupId(specialtyGroupId);
        return Optional.of(mapper.toSpecialties(specialtyEntities));
    }


    @Override
    public Optional<Specialty> getSpecialty(int specialtyId)
    {
        return specialtyCrudRepository.findById(specialtyId).map(specialtyEntity -> mapper.toSpecialty(specialtyEntity));
    }
    @Override
    public Specialty save(Specialty specialty)
    {
        SpecialtyEntity specialtyEntity = mapper.toSpecialtyEntity(specialty);
        return mapper.toSpecialty(specialtyCrudRepository.save(specialtyEntity));
    }
    @Override
    public void delete(int specialtyId)
    {
        specialtyCrudRepository.deleteById(specialtyId);
    }

}
