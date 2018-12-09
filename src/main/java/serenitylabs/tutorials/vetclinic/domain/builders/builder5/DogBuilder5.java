package serenitylabs.tutorials.vetclinic.domain.builders.builder5;

import java.time.LocalDateTime;

public class DogBuilder5 implements WithBreed, OfColour {

    private String name;
    private String breed;
    private String favouriteFood;
    private String colour;

    public DogBuilder5(String name) {
        this.name = name;
    }

    public static WithBreed called(String name) {
        return new DogBuilder5(name);
    }

    public DogByBuilder5 bornOn(LocalDateTime dateOfBirth) {
        return new DogByBuilder5(name, breed, dateOfBirth, favouriteFood, colour);
    }

    public DogBuilder5 withFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
        return this;
    }

    @Override
    public DogBuilder5 ofBreed(String breed) {
        this.breed = breed;
        return this;
    }

    @Override
    public DogBuilder5 ofColour(String colour) {
        this.colour = colour;
        return this;
    }
}


