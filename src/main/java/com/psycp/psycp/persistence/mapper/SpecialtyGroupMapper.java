package com.psycp.psycp.persistence.mapper;

import com.psycp.psycp.domain.SpecialtyGroupDTO;
import com.psycp.psycp.persistence.entity.SpecialtyGroup;
import org.mapstruct.Mapper;
import org.mapstruct.InheritInverseConfiguration;

@Mapper(componentModel = "spring")
public interface SpecialtyGroupMapper {

    SpecialtyGroupDTO toSpecialtyGroupDTO(SpecialtyGroup specialtyGroup);
    @InheritInverseConfiguration
    SpecialtyGroup toSpecialtyGroup(SpecialtyGroupDTO specialtyGroupDTO);
}
