package thegamerurso.springframework.sfgpetclinic.services;

import thegamerurso.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
