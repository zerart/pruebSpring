package com.psycp.psycp.persistence.crud;

import com.psycp.psycp.persistence.entity.Specialty;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpecialtyCrudRepository extends CrudRepository <Specialty,Integer>{

    //@Query(value="SELECT * FROM specialtys WHERE specialty_Id = ?", nativeQuery = true)

    //List<Specialty> findBySpecialtyId(int specialtyId);
    List<Specialty> findBySpecialtyGroupId(int specialtyId);


}
