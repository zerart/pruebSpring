package com.psycp.psycp.domain.repository;

import com.psycp.psycp.domain.SpecialtyDTO;

import java.util.Optional;
import java.util.List;

public interface SpecialtyRepositoryDTO
{
    List<SpecialtyDTO> getAll();
    Optional<List<SpecialtyDTO>> getBySpecialtyGroupDTO(int specialtyGroupId);
    Optional<SpecialtyDTO> getSpecialtyDTO(int specialtyId);
    SpecialtyDTO save(SpecialtyDTO specialty);
    void delete(int specialtyId);
}
