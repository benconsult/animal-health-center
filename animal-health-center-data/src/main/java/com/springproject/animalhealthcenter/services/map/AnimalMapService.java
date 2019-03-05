package com.springproject.animalhealthcenter.services.map;

import com.springproject.animalhealthcenter.model.Animal;
import com.springproject.animalhealthcenter.services.AnimalService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class AnimalMapService extends AbstractMapService<Animal, Long> implements AnimalService {


    @Override
    public Set<Animal> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Animal object) {
      super.delete(object);
    }

    @Override
    public Animal save(Animal object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteBYId(id);

    }

    @Override
    public Animal findById(Long id) {
        return super.findById(id);
    }
}
