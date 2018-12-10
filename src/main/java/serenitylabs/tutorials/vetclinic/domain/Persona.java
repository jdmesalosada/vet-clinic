package serenitylabs.tutorials.vetclinic.domain;

public class Persona {

    private final String name;
    private final String lastName;
    private final Integer age;
    private final String email;
    private final String address;

    public Persona(String name, String lastName, Integer age, String email, String address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
