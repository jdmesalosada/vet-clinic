package serenitylabs.tutorials.vetclinic.domain.builders.builder4;

import java.time.LocalDateTime;

public class DogBuilder4 implements WithBreed {

    private String name;
    private String breed;
    private LocalDateTime dateOfBirth;
    private String favouriteFood;

    public DogBuilder4(String name) {
        this.name = name;
    }

    public static WithBreed called(String name) {
        return new DogBuilder4(name);
    }

    public DogByBuilder4 bornOn(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return new DogByBuilder4(name, breed, dateOfBirth, favouriteFood);
    }

    public DogBuilder4 withFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
        return this;
    }

    @Override
    public DogBuilder4 ofBreed(String breed) {
        this.breed = breed;
        return this;
    }
}


