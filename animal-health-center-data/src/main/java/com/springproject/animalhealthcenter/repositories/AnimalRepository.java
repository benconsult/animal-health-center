package com.springproject.animalhealthcenter.repositories;

import com.springproject.animalhealthcenter.model.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
