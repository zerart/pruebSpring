package com.psycp.psycp.domain.repository;

import com.psycp.psycp.domain.Specialty;
import com.psycp.psycp.persistence.entity.SpecialtyEntity;

import java.util.Optional;
import java.util.List;

public interface SpecialtyRepository
{
    List<Specialty> getAll();
    Optional<List<Specialty>> getBySpecialtyGroup(int specialtyGroupId);
    Optional<Specialty> getSpecialty(int specialtyId);
    Specialty save(Specialty specialty);
    void delete(int specialtyId);
}
