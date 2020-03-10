package thegamerurso.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import thegamerurso.springframework.sfgpetclinic.model.Owner;
import thegamerurso.springframework.sfgpetclinic.model.Pet;
import thegamerurso.springframework.sfgpetclinic.services.OwnerService;
import thegamerurso.springframework.sfgpetclinic.services.PetService;
import thegamerurso.springframework.sfgpetclinic.services.PetTypeService;

import java.util.Set;
@Service
public class OwnerMapService extends AbstractMapService<Owner,Long> implements OwnerService {

    private final PetTypeService petTypeService;

    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete((object));
    }

    @Override
    public Owner save(Owner object) {

        if(object!=null){
            if(object.getPets()!=null){
                object.getPets().forEach((pet ->{
                    if(pet.getPetType() !=null){
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }else{
                        throw new RuntimeException("Pet Type is Required");
                    }

                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                }));
            }
            return super.save(object);
        }else{
            return  null;
        }
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return this.findByLastName(lastName);
    }
}
