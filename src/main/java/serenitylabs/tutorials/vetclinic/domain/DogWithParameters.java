package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;


//This class is immutable due doesn't have setters methods and the private fields are marked as final
public class DogWithParameters {

    private final String name;
    private final String breed;
    private final LocalDateTime dateOfBirth;
    private String favouriteFood;

    public DogWithParameters(String name, String breed, LocalDateTime dateOfBirth) {
        //We call the above constructor
        this(name, breed, dateOfBirth, null);
    }

    public DogWithParameters(String name, String breed, LocalDateTime dateOfBirth, String favouriteFood) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favouriteFood = favouriteFood;
    }

    public String getName(){
        return this.name;
    }

    public String getBreed(){
        return this.breed;
    }

    public LocalDateTime getDateOfBirth(){
        return this.dateOfBirth;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }
}
