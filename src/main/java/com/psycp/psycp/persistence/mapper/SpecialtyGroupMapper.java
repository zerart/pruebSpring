package com.psycp.psycp.persistence.mapper;

import com.psycp.psycp.domain.SpecialtyGroup;
import com.psycp.psycp.persistence.entity.SpecialtyGroupEntity;
import org.mapstruct.Mapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")
@Component
public interface SpecialtyGroupMapper {

    SpecialtyGroup toSpecialtyGroup(SpecialtyGroupEntity specialtyGroupEntity);
    @InheritInverseConfiguration
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updateAt", ignore = true)
    SpecialtyGroupEntity toSpecialtyGroupEntity(SpecialtyGroup specialtyGroup);
}
