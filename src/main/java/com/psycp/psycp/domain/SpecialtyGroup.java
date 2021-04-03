package com.psycp.psycp.domain;

public class SpecialtyGroup {
    private int specialtyGroupId;
    private String specialtyGroupName;
    private int activate;

    public int getSpecialtyGroupId() {
        return specialtyGroupId;
    }

    public void setSpecialtyGroupId(int specialtyGroupId) {
        this.specialtyGroupId = specialtyGroupId;
    }

    public String getSpecialtyGroupName() {
        return specialtyGroupName;
    }

    public void setSpecialtyGroupName(String specialtyGroupName) {
        this.specialtyGroupName = specialtyGroupName;
    }

    public int getActivate() {
        return activate;
    }

    public void setActivate(int activate) {
        this.activate = activate;
    }
}
