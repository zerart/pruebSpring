package com.psycp.psycp.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "specialtys")
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specialty_id")
    private Integer specialtyId;

    // @Column(name="specialty_groups_specialty_groups_id")
    // private Integer specialtyGroupsSpecialtyGroupsId;


    @ManyToOne
    @JoinColumn(name = "specialty_groups_specialty_groups_id", insertable = false, updatable = false)
    private SpecialtyGroup specialtyGroup;

    @Column(name = "specialty_name")
    private String specialtyName;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "activate")
    private Integer activate;


    public Integer getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(Integer specialtyId) {
        this.specialtyId = specialtyId;
    }

    public SpecialtyGroup getSpecialtyGroup() {
        return specialtyGroup;
    }

    public void setSpecialtyGroup(SpecialtyGroup specialtyGroup) {
        this.specialtyGroup = specialtyGroup;
    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getActivate() {
        return activate;
    }

    public void setActivate(Integer activate) {
        this.activate = activate;
    }


}
