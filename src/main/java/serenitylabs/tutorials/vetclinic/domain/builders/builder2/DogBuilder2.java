package serenitylabs.tutorials.vetclinic.domain.builders.builder2;

import java.time.LocalDateTime;

public class DogBuilder2 {

    private String name;
    private String breed;
    private LocalDateTime dateOfBirth;

    public DogBuilder2(String name) {
        this.name = name;
    }

    public static DogBuilder2 called(String name) {
        return new DogBuilder2(name);
    }

    public DogBuilder2 ofBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public DogByBuilder2 bornOn(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return new DogByBuilder2(name, breed, dateOfBirth);
    }
}


