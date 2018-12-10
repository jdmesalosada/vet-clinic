package serenitylabs.tutorials.vetclinic.practicecreatingapersona;

import serenitylabs.tutorials.vetclinic.domain.Persona;

public class PersonaBuilder implements WithEmail, WithAddress, WithLastName {

    private String name;
    private String lastName;
    private String email;
    private Integer age;
    private String address;

    public PersonaBuilder(String name) {
        this.name = name;
    }

    public static WithEmail called(String name) {
        return new PersonaBuilder(name);
    }

    public PersonaBuilder withAge(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * #### MANDATORY FIELDS ######
     **/
    @Override
    public PersonaBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public PersonaBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public PersonaBuilder withLastName(String lastname) {
        this.lastName = lastname;
        return this;
    }

    /**
     * #### END MANDATORY FIELDS ######
     **/

    public Persona create() {
        return new Persona(name, lastName, age, email, address);
    }
}
