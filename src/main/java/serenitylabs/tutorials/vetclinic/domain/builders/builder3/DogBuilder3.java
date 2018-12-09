package serenitylabs.tutorials.vetclinic.domain.builders.builder3;

import java.time.LocalDateTime;

public class DogBuilder3 implements WithBreed {

    private String name;
    private String breed;
    private LocalDateTime dateOfBirth;

    public DogBuilder3(String name) {
        this.name = name;
    }

    public static WithBreed called(String name) {
        return new DogBuilder3(name);
    }

    public DogByBuilder3 bornOn(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return new DogByBuilder3(name, breed, dateOfBirth);
    }

    @Override
    public DogBuilder3 ofBreed(String breed) {
        this.breed = breed;
        return this;
    }
}


