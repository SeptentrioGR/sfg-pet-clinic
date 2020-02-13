package thegamerurso.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import thegamerurso.springframework.sfgpetclinic.model.Owner;
import thegamerurso.springframework.sfgpetclinic.model.Pet;
import thegamerurso.springframework.sfgpetclinic.model.PetType;
import thegamerurso.springframework.sfgpetclinic.model.Vet;
import thegamerurso.springframework.sfgpetclinic.services.OwnerService;
import thegamerurso.springframework.sfgpetclinic.services.PetTypeService;
import thegamerurso.springframework.sfgpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    
    public DataLoader(OwnerService ownerService,VetService vetService,PetTypeService petTypeService){
            this.ownerService = ownerService;
            this.vetService = vetService;
            this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);
        
        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetTpe = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("123123123234");
        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("123123123234");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        Pet FionasCat = new Pet();
        FionasCat.setName("Just Cat");
        FionasCat.setOwner(owner2);
        FionasCat.setBirthDate(LocalDate.now());
        FionasCat.setPetType(savedCatPetTpe);
        owner2.getPets().add(FionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter2");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
