package thegamerurso.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import thegamerurso.springframework.sfgpetclinic.model.Pet;
import thegamerurso.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstrctMapService<Pet,Long> implements CrudService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
