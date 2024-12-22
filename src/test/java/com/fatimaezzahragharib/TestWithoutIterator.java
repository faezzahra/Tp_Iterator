package com.fatimaezzahragharib;

import java.util.HashSet;
import java.util.Set;

public class TestWithoutIterator {
    public static void main(String[] args) {
        Set<Person> individuals = new HashSet<>();

        // Ajouter des instances de Person
        individuals.add(new Person(1, "John"));
        individuals.add(new Person(2, "Jane"));
        individuals.add(new Person(3, "Jake"));

        // Suppression sans itérateur (provoque une ConcurrentModificationException)
        for (Person individual : individuals) {
            if (individual.getName().equals("Jane")) {
                individuals.remove(individual); // Problème ici
            }
        }
    }
}