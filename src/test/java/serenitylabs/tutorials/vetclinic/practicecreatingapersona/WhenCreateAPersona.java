package serenitylabs.tutorials.vetclinic.practicecreatingapersona;

import org.junit.Test;
import serenitylabs.tutorials.vetclinic.domain.Persona;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenCreateAPersona {

    @Test
    public void create_a_persona() {

        Persona julian = PersonaBuilder.called("Julian")
                .withEmail("jdmesalosada@gmail.com")
                .withAddress("calle 65")
                .withLastName("Losada")
                .withAge(28)
                .create();

        assertThat(julian.getName(), equalTo("Julian"));
        assertThat(julian.getLastName(), equalTo("Losada"));
        assertThat(julian.getAge(), equalTo(30));

    }
}
