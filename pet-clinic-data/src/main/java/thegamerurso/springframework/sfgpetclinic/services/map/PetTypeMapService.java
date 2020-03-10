package thegamerurso.springframework.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import thegamerurso.springframework.sfgpetclinic.model.PetType;
import thegamerurso.springframework.sfgpetclinic.services.PetTypeService;

import java.util.Set;
@Service
@Profile({"default","map"})
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public PetType save(PetType pettype) {
        return super.save(pettype);
    }

    @Override
    public void delete(PetType pettype) {
        super.delete(pettype);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
