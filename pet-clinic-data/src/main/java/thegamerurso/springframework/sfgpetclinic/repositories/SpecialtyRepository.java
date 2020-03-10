package thegamerurso.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import thegamerurso.springframework.sfgpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality,Long> {
}
