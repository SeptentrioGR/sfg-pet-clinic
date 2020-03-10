package thegamerurso.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import thegamerurso.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
