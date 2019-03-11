package com.springproject.animalhealthcenter.services.map;

import com.springproject.animalhealthcenter.model.Speciality;
import com.springproject.animalhealthcenter.model.Vet;
import com.springproject.animalhealthcenter.services.SpecialityService;
import com.springproject.animalhealthcenter.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
     private final SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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
        if(object.getSpeciality().size() > 0){
            object.getSpeciality().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
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
