package serenitylabs.tutorials.vetclinic.domain.version1;

import serenitylabs.tutorials.vetclinic.domain.builders.builder5.DogByBuilder5;

import java.time.LocalDateTime;

public class DogBreeder implements WithColour, WithBreed {

    private String name;
    private String breed;
    private String favouriteFood;
    private String colour;

    public static DogBreeder aDog() {
        return new DogBreeder();
    }

    public DogBreeder called(String name) {
        this.name = name;
        return this;
    }

    public WithColour ofBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public DogBreeder ofColour(String colour) {
        this.colour = colour;
        return this;
    }

    public DogBreeder withFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
        return this;
    }

    public DogByBuilder5 bornOn(LocalDateTime dateOfBirth) {
        return new DogByBuilder5(name, breed, dateOfBirth, favouriteFood, colour);
    }
}