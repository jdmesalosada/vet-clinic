package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;
import serenitylabs.tutorials.vetclinic.domain.builders.builder1.DogBuilder1;
import serenitylabs.tutorials.vetclinic.domain.builders.builder1.DogByBuilder1;
import serenitylabs.tutorials.vetclinic.domain.builders.builder2.DogBuilder2;
import serenitylabs.tutorials.vetclinic.domain.builders.builder2.DogByBuilder2;
import serenitylabs.tutorials.vetclinic.domain.builders.builder3.DogBuilder3;
import serenitylabs.tutorials.vetclinic.domain.builders.builder3.DogByBuilder3;
import serenitylabs.tutorials.vetclinic.domain.builders.builder4.DogBuilder4;
import serenitylabs.tutorials.vetclinic.domain.builders.builder4.DogByBuilder4;
import serenitylabs.tutorials.vetclinic.domain.builders.builder5.DogBuilder5;
import serenitylabs.tutorials.vetclinic.domain.builders.builder5.DogByBuilder5;

import java.time.LocalDateTime;

public class WheCreatingANewDog {
    @Test
    public void it_should_have_a_name() {
        Dog fido = new Dog();
        LocalDateTime birthDay = LocalDateTime.now();

        fido.setName("Fido");
        fido.setBreed("Poodle");
        fido.setDateOfBirth(birthDay);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals(birthDay, fido.getDateOfBirth());
    }

    @Test
    public void it_should_have_a_name_with_contructor_with_parameters() {

        LocalDateTime birthDay = LocalDateTime.now();
        DogWithParameters fido = new DogWithParameters("Fido", "Poodle", birthDay);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals(birthDay, fido.getDateOfBirth());
    }

    @Test
    public void it_should_have_an_optional_favourite_food() {
        LocalDateTime birthDay = LocalDateTime.now();
        DogWithParameters fido = new DogWithParameters("Fido", "Poodle", birthDay);
        Assert.assertEquals("pizza", fido.getFavouriteFood());
    }

    @Test
    public void it_should_have_a_dog_using_builder_pattern_1() {
        LocalDateTime birthDay = LocalDateTime.now();

        DogByBuilder1 fido = DogBuilder1
                .called("Fido")
                .ofBreed("Poodle")
                .bornOn(birthDay)
                .build();
        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals(birthDay, fido.getDateOfBirth());
    }

    @Test
    public void it_should_have_a_dog_using_builder_pattern_2_without_build_method() {
        LocalDateTime birthDay = LocalDateTime.now();

        DogByBuilder2 fido = DogBuilder2
                .called("Fido")
                .ofBreed("Poodle")
                .bornOn(birthDay);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals(birthDay, fido.getDateOfBirth());
    }

    @Test
    public void it_should_have_a_dog_using_builder_pattern_3_required_breed() {
        LocalDateTime birthDay = LocalDateTime.now();

        DogByBuilder3 fido = DogBuilder3
                .called("Fido")
                .ofBreed("Poodle")
                .bornOn(birthDay);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals(birthDay, fido.getDateOfBirth());
    }

    @Test
    public void it_should_have_a_dog_using_builder_pattern_4_required_breed() {
        LocalDateTime birthDay = LocalDateTime.now();

        DogByBuilder4 fido = DogBuilder4
                .called("Fido")
                .ofBreed("Poodle")
                .withFavouriteFood("pizza")
                .bornOn(birthDay);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals("pizza", fido.getFavouriteFood());
        Assert.assertEquals(birthDay, fido.getDateOfBirth());
    }

    @Test
    public void it_should_have_a_dog_using_builder_pattern_5_required_breed_and_colour() {
        LocalDateTime birthDay = LocalDateTime.now();

        DogByBuilder5 fido = DogBuilder5
                .called("Fido")
                .ofBreed("Poodle")
                .ofColour("black")
                .withFavouriteFood("pizza")
                .bornOn(birthDay);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals("pizza", fido.getFavouriteFood());
        Assert.assertEquals(birthDay, fido.getDateOfBirth());
        Assert.assertEquals("black", fido.getColour());
    }

}
