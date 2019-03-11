package com.springproject.animalhealthcenter.model;

import java.util.Set;

public class Owner extends Person {
  private Set<Animal> animals;

    public Set<Animal> getAnimal() {
        return animals;
    }

    public void setAnimal(Set<Animal> animals) {
        this.animals = animals;
    }
}
