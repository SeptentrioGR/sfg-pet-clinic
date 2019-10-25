package thegamerurso.springframework.sfgpetclinic.services;

import thegamerurso.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByLastName(String lastName);
    Pet findByID(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
