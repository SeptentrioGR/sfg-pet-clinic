package thegamerurso.springframework.sfgpetclinic.services;

import thegamerurso.springframework.sfgpetclinic.model.Pet;

public interface PetService extends CrudService<Pet,Long>{
    Pet findByLastName(String lastName);
}
