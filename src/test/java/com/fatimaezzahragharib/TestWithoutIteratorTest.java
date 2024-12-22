package com.fatimaezzahragharib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class TestWithoutIteratorTest {

    @Test
    public void testRemoveWithoutIterator() {
        Set<Person> individuals = new HashSet<>();
        individuals.add(new Person(1, "John"));
        individuals.add(new Person(2, "Jane"));
        individuals.add(new Person(3, "Jake"));

        // Tentative de suppression sans itérateur, ce qui provoque une ConcurrentModificationException
        assertThrows(UnsupportedOperationException.class, () -> {
            for (Person individual : individuals) {
                if (individual.getName().equals("Jane")) {
                    individuals.remove(individual); // Problème ici
                }
            }
        });
    }
}
