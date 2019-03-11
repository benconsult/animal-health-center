package com.springproject.animalhealthcenter.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {
    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpeciality() {
        return specialities;
    }

    public void setSpeciality(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
