package com.springproject.animalhealthcenter.services.map;

import com.springproject.animalhealthcenter.model.Vet;
import com.springproject.animalhealthcenter.services.CrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
       super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
         super.deleteBYId(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
