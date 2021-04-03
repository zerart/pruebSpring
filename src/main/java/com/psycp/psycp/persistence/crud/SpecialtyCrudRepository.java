package com.psycp.psycp.persistence.crud;

import com.psycp.psycp.persistence.entity.SpecialtyEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpecialtyCrudRepository extends CrudRepository <SpecialtyEntity,Integer>{

    //@Query(value="SELECT * FROM specialtys WHERE specialty_Id = ?", nativeQuery = true)

    List<SpecialtyEntity> findBySpecialtyGroupEntitySpecialtyGroupId(int specialtyId);


}
