package serenitylabs.tutorials.vetclinic.domain.builders.builder2;

import java.time.LocalDateTime;

public class DogByBuilder2 {
    private String name;
    private String breed;
    private LocalDateTime dateOfBirth;
    private String favouriteFood;

    public DogByBuilder2(String name, String breed, LocalDateTime dateOfBirth) {
        //We call the above constructor
        this(name, breed, dateOfBirth, null);
    }

    public DogByBuilder2(String name, String breed, LocalDateTime dateOfBirth, String favouriteFood) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favouriteFood = favouriteFood;
    }

    public LocalDateTime getDateOfBirth(){
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}
