package thegamerurso.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import thegamerurso.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
