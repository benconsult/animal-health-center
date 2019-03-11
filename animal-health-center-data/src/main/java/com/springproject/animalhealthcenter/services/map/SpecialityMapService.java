package com.springproject.animalhealthcenter.services.map;

import com.springproject.animalhealthcenter.model.Speciality;
import com.springproject.animalhealthcenter.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
 super.deleteBYId(id);
    }

    @Override
    public void delete(Speciality object) {
    super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
