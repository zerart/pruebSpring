package com.psycp.psycp.domain;

public class Specialty {
    private int specialtyId;
    private SpecialtyGroup specialtyGroup;
    private String specialtyName;
    private int activate;

    public int getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(int specialtyId) {
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

    public int getActivate() {
        return activate;
    }

    public void setActivate(int activate) {
        this.activate = activate;
    }
}
