package thegamerurso.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;
import thegamerurso.springframework.sfgpetclinic.model.Pet;

@Service
public interface PetService extends CrudService<Pet, Long> {

}