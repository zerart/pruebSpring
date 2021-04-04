package com.psycp.psycp.persistence.mapper;

import com.psycp.psycp.persistence.entity.SpecialtyEntity;
import com.psycp.psycp.domain.Specialty;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SpecialtyGroupMapper.class})
@Component
public interface SpecialtyMapper
{
    Specialty toSpecialty(SpecialtyEntity specialtyEntity);
    List<Specialty> toSpecialties(List<SpecialtyEntity> specialtyEntities);
    @InheritInverseConfiguration
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updateAt", ignore = true)
    SpecialtyEntity toSpecialtyEntity(Specialty specialty);
}
