package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        // Given
        Person person = new Person(1L, "Joe", "Buck");

        // Then
        assertAll("Test Props Set",
                ()-> assertEquals("Joe", person.getFirstName()),
                ()-> assertEquals("Buck", person.getLastName()));
    }

    @Test
    void groupedAssertionsMsgs() {
        // Given
        Person person = new Person(1L, "Joe", "Buck");

        // Then
        assertAll("Test Props Set",
                ()-> assertEquals("Joe", person.getFirstName(), "First Name failed"),
                ()-> assertEquals("Buck", person.getLastName(), "Last Name failed"));
    }

}