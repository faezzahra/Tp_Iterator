package com.fatimaezzahragharib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testEqualsAndHashCode() {
        Person person1 = new Person(1, "John");
        Person person2 = new Person(1, "John");
        Person person3 = new Person(2, "Jane");

        // Test equals
        assertTrue(person1.equals(person2)); // Même id, donc égaux
        assertFalse(person1.equals(person3)); // Id différents, donc pas égaux

        // Test hashCode
        assertEquals(person1.hashCode(), person2.hashCode()); // Même id, même hashCode
        assertNotEquals(person1.hashCode(), person3.hashCode()); // Id différents, hashCode différents
    }

    @Test
    public void testToString() {
        Person person = new Person(1, "John");
        String expectedString = "Person{id=1, name='John'}";
        assertEquals(expectedString, person.toString());
    }
}
