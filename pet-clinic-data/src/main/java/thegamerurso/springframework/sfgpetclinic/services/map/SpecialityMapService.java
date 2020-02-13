package thegamerurso.springframework.sfgpetclinic.services.map;

import thegamerurso.springframework.sfgpetclinic.model.Speciality;
import thegamerurso.springframework.sfgpetclinic.services.SpecialitiesService;

import java.util.Set;

public class SpecialityMapService extends AbstrctMapService<Speciality,Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
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
