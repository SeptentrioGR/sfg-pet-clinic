package thegamerurso.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import thegamerurso.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
