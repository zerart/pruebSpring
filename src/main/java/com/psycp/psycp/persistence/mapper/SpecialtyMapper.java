package com.psycp.psycp.persistence.mapper;

import com.psycp.psycp.persistence.entity.Specialty;
import com.psycp.psycp.domain.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SpecialtyGroupMapper.class})
public interface SpecialtyMapper
{
    SpecialtyDTO toSpecialtyDTO(Specialty specialty);
    List<SpecialtyDTO> toSpecialtysDTO(List<Specialty> specialtys);
    @InheritInverseConfiguration
    Specialty toSpecialty(SpecialtyDTO specialtyDTO);

}
