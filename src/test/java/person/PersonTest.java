package person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void shouldToString() {
        String expectedToString = "Person{name='Adam', surname='Nowak', age=30, pesel='84101812345}";
        Person person = new Person("Adam", "Nowak", 30, "84101812345");

        assertEquals(expectedToString, person.toString());
    }
}