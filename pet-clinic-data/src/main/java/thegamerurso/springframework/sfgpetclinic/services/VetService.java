package thegamerurso.springframework.sfgpetclinic.services;

import thegamerurso.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);
    Vet findByID(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
