package com.veterinariosBackEnd.veterinariosBackEnd.model;

public class Veterinary {

    private int vetId;
    private String vetName;
    private String vetSpeciality;
    private double experience;
    private String clinic;

    public Veterinary(int vetId, String vetName, String vetSpeciality, double experience, String clinic) {
        super();
        this.vetId = vetId;
        this.vetName = vetName;
        this.vetSpeciality = vetSpeciality;
        this.experience = experience;
        this.clinic = clinic;
    }

    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public String getVetSpeciality() {
        return vetSpeciality;
    }

    public void setVetSpeciality(String vetSpeciality) {
        this.vetSpeciality = vetSpeciality;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }
}
