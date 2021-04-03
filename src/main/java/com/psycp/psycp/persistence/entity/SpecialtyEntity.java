package com.psycp.psycp.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "specialtys")
public class SpecialtyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specialty_id")
    private Integer specialtyId;

    // @Column(name="specialty_groups_specialty_groups_id")
    // private Integer specialtyGroupsSpecialtyGroupsId;


    @ManyToOne
    @JoinColumn(name = "specialty_groups_specialty_groups_id", insertable = false, updatable = false)
    private SpecialtyGroupEntity specialtyGroupEntity;

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

    public SpecialtyGroupEntity getSpecialtyGroupEntity() {
        return specialtyGroupEntity;
    }

    public void setSpecialtyGroupEntity(SpecialtyGroupEntity specialtyGroupEntity) {
        this.specialtyGroupEntity = specialtyGroupEntity;
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
