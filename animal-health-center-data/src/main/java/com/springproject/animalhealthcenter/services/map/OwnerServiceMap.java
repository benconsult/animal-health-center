package com.springproject.animalhealthcenter.services.map;

import com.springproject.animalhealthcenter.model.Animal;
import com.springproject.animalhealthcenter.model.Owner;
import com.springproject.animalhealthcenter.services.AnimalService;
import com.springproject.animalhealthcenter.services.AnimalTypeService;
import com.springproject.animalhealthcenter.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    private final AnimalTypeService animalTypeService;
    private final AnimalService animalService;

    public OwnerServiceMap(AnimalTypeService animalTypeService, AnimalService animalService) {
        this.animalTypeService = animalTypeService;
        this.animalService = animalService;
    }


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public Owner save(Owner object) {
        Owner savaOwner = null;
        if(object != null){
            if(object.getAnimals() != null){
                object.getAnimals().forEach(animal -> {
                    if(animal.getAnimalType() != null){
                        if(animal.getAnimalType().getId() == null){
                            animal.setAnimalType(animalTypeService.save(animal.getAnimalType()));
                        }
                    }else {throw new RuntimeException("Pet Type is required");
                    }
                    if(animal.getId() == null){
                        Animal saveAnimal = animalService.save(animal);
                        animal.setId(saveAnimal.getId());
                    }
                });
            }
            return super.save(object);
        }else{
            return null;
        }


    }

    @Override
    public void deleteById(Long id) {
         super.deleteBYId(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
