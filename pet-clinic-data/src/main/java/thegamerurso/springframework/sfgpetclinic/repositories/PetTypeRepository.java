package thegamerurso.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import thegamerurso.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
