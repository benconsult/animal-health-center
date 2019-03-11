package com.springproject.animalhealthcenter.bootstrap;

import com.springproject.animalhealthcenter.model.*;
import com.springproject.animalhealthcenter.services.AnimalTypeService;
import com.springproject.animalhealthcenter.services.OwnerService;
import com.springproject.animalhealthcenter.services.SpecialityService;
import com.springproject.animalhealthcenter.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final AnimalTypeService animalTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, AnimalTypeService animalTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.animalTypeService = animalTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = animalTypeService.findAll().size();

        if(count == 0){
            loadData();
        }

    }

    private void loadData() {
        AnimalType dog = new AnimalType();
        dog.setName("Dog");
        AnimalType saveDogAnimalType=  animalTypeService.save(dog);

        AnimalType cat = new AnimalType();
        dog.setName("Cat");
        AnimalType saveCatAnimalType=  animalTypeService.save(cat);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality saveSurgery = specialityService.save(surgery);

        Speciality dentistry= new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality saveDentistry = specialityService.save(dentistry);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality saveRadiology = specialityService.save(radiology);


        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastname("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Maimi");
        owner1.setTelephone("23468746778");

        Animal mikeAnimal = new Animal();
        mikeAnimal.setAnimalType(saveDogAnimalType);
        mikeAnimal.setOwner(owner1);
        mikeAnimal.setBirthdate(LocalDate.now());
        mikeAnimal.setName("Rosco");
        owner1.getAnimals().add(mikeAnimal);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastname("Gleanance");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Maimi");
        owner2.setTelephone("23468746778");

        Animal fionaCat = new Animal();
        fionaCat.setName("Just Cat");
        fionaCat.setOwner(owner2);
        fionaCat.setBirthdate(LocalDate.now());
        fionaCat.setAnimalType(saveCatAnimalType);
        owner2.getAnimals().add(fionaCat);
        ownerService.save(owner2);

        System.out.println("Loaded Owners......");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastname("Axe");
        vet1.getSpeciality().add(saveRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("John");
        vet2.setLastname("Joshua");
        vet2.getSpeciality().add(saveSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets.....");
    }
}
