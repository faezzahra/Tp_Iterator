package com.fatimaezzahragharib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class TestWithIteratorTest {

    @Test
    public void testRemoveWithIterator() {
        Set<Person> individuals = new HashSet<>();
        individuals.add(new Person(1, "John"));
        individuals.add(new Person(2, "Jane"));
        individuals.add(new Person(3, "Jake"));

        Iterator<Person> personIterator = individuals.iterator();
        while (personIterator.hasNext()) {
            Person individual = personIterator.next();
            if (individual.getName().equals("Jane")) {
                personIterator.remove();
            }
        }

        // Vérification que Jane a été supprimée
        boolean janeExists = false;
        for (Person individual : individuals) {
            if (individual.getName().equals("Jane")) {
                janeExists = true;
                break;
            }
        }
        assertFalse(janeExists); // Jane ne doit plus être dans le set
    }
}
