package serenitylabs.tutorials.vetclinic.domain.builders.builder1;

import java.time.LocalDateTime;

public class DogBuilder1 {

    private String name;
    private String breed;
    private LocalDateTime dateOfBirth;

    public DogBuilder1(String name) {
        this.name = name;
    }

    public static DogBuilder1 called(String name) {
        return new DogBuilder1(name);
    }

    public DogBuilder1 ofBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public DogBuilder1 bornOn(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public DogByBuilder1 build() {
        return new DogByBuilder1(name, breed, dateOfBirth);
    }
}


