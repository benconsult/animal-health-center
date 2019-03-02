package com.springproject.animalhealthcenter.services;

import com.springproject.animalhealthcenter.model.Animal;

import java.util.Set;

public interface AnimalService {
    Animal findById(Long id);

    Animal save(Animal animal);

    Set<Animal> findAll();
}
