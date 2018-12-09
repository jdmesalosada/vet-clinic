package serenitylabs.tutorials.vetclinic.domain.builders.builder5;

import java.time.LocalDateTime;

public class DogByBuilder5 {
    private final String name;
    private final String breed;
    private final LocalDateTime dateOfBirth;
    private final String favouriteFood;
    private final String colour;

    public DogByBuilder5(String name, String breed, LocalDateTime dateOfBirth, String favouriteFood, String colour) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favouriteFood = favouriteFood;
        this.colour = colour;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getColour() {
        return colour;
    }
}
