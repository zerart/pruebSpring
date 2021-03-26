package com.psycp.psycp.domain;

public class SpecialtyDTO {
    private int specialtyId;
    private SpecialtyGroupDTO specialtyGroupDTO;
    private String specialtyName;
    private int activate;

    public int getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(int specialtyId) {
        this.specialtyId = specialtyId;
    }

    public SpecialtyGroupDTO getSpecialtyGroup() {
        return specialtyGroupDTO;
    }

    public void setSpecialtyGroup(SpecialtyGroupDTO specialtyGroupDTO) {
        this.specialtyGroupDTO = specialtyGroupDTO;
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
