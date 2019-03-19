package com.springproject.animalhealthcenter.model;
//Animal Health Center Application Created By Benjamen Aremu

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "owners")
public class Owner extends Person {
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "telephone")
    private String telephone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Animal> animals = new HashSet<>();//initialize animal so that when ew add new
    //animal it is going to be added to the hashset

	//Adding getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}
