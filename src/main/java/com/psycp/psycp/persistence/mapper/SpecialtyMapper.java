package com.psycp.psycp.persistence.mapper;

import com.psycp.psycp.persistence.entity.SpecialtyEntity;
import com.psycp.psycp.domain.Specialty;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SpecialtyGroupMapper.class})
public interface SpecialtyMapper
{

    @Mappings({
            @Mapping(source = "specialtyName", target = "specialtyName"),
            @Mapping(source = "specialtyId", target = "specialtyId"),
            @Mapping(source = "activate", target = "activate"),
            @Mapping(source = "specialtyGroup", target = "specialtyGroup"),
    })
    Specialty toSpecialty(SpecialtyEntity specialtyEntity);
    List<Specialty> toSpecialties(List<SpecialtyEntity> specialtyEntities);
    @InheritInverseConfiguration
    SpecialtyEntity toSpecialtyEntity(Specialty specialty);

}
