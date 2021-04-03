package com.psycp.psycp.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name="specialty_groups")
public class SpecialtyGroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name="specialty_groups_id")
    private Integer specialtyGroupId;

    @Column(name="specialty_groups_name")
    private String specialtyGroupName;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="update_at")
    private LocalDateTime updateAt;

    @Column(name="activate")
    private Integer activate;

    @OneToMany(mappedBy =  "specialtyGroupEntity")
    private List<SpecialtyEntity> specialtyEntities;

    public Integer getSpecialtyGroupId() {
        return specialtyGroupId;
    }

    public void setSpecialtyGroupId(Integer specialtyGroupId) {
        this.specialtyGroupId = specialtyGroupId;
    }

    public String getSpecialtyGroupName() {
        return specialtyGroupName;
    }

    public void setSpecialtyGroupName(String specialtyGroupName) {
        this.specialtyGroupName = specialtyGroupName;
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

    public List<SpecialtyEntity> getSpecialtyEntities() {
        return specialtyEntities;
    }

    public void setSpecialtyEntities(List<SpecialtyEntity> specialtyEntities) {
        this.specialtyEntities = specialtyEntities;
    }
}
