package thegamerurso.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import thegamerurso.springframework.sfgpetclinic.model.Speciality;
import thegamerurso.springframework.sfgpetclinic.model.Vet;
import thegamerurso.springframework.sfgpetclinic.services.SpecialityService;
import thegamerurso.springframework.sfgpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService
{
    private  final SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialities().size() >0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId()==null){
                    Speciality savedSpeciality = specialityService.save(speciality);
                    savedSpeciality.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
