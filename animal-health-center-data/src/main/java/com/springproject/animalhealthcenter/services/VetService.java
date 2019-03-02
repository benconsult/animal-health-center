package com.springproject.animalhealthcenter.services;

import com.springproject.animalhealthcenter.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
