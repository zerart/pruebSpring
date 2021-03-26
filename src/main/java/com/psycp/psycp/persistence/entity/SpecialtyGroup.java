package com.psycp.psycp.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="specialty_groups")
public class SpecialtyGroup {
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

    @OneToMany(mappedBy =  "specialtyGroup")
    private List<Specialty> specialtys;

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

    public List<Specialty> getSpecialtys() {
        return specialtys;
    }

    public void setSpecialtys(List<Specialty> specialtys) {
        this.specialtys = specialtys;
    }
}
