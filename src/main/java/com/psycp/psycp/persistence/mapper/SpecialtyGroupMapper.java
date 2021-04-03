package com.psycp.psycp.persistence.mapper;

import com.psycp.psycp.domain.SpecialtyGroup;
import com.psycp.psycp.persistence.entity.SpecialtyGroupEntity;
import org.mapstruct.Mapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface SpecialtyGroupMapper {

    @Mappings({
            @Mapping(source = "specialtyGroupName", target = "specialtyGroupName"),
            @Mapping(source = "specialtyGroup", target = "specialtyGroup"),
    })
    SpecialtyGroup toSpecialtyGroup(SpecialtyGroupEntity specialtyGroupEntity);
    @InheritInverseConfiguration
    SpecialtyGroupEntity toSpecialtyGroupEntity(SpecialtyGroup specialtyGroup);
}
