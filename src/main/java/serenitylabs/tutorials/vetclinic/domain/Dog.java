package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {

    private String name;
    private String breed;
    private LocalDateTime birthDate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setDateOfBirth(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getDateOfBirth() {
        return birthDate;
    }
}
