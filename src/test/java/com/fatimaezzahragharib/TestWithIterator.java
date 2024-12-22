package com.fatimaezzahragharib;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestWithIterator {
    public static void main(String[] args) {
        Set<Person> individuals = new HashSet<>();

        // Ajouter des instances de Person
        individuals.add(new Person(1, "John"));
        individuals.add(new Person(2, "Jane"));
        individuals.add(new Person(3, "Jake"));

        // Suppression sécurisée avec un itérateur
        Iterator<Person> personIterator = individuals.iterator();
        while (personIterator.hasNext()) {
            Person individual = personIterator.next();
            if (individual.getName().equals("Jane")) {
                personIterator.remove(); // Suppression sécurisée
            }
        }

        // Affichage du Set après suppression
        System.out.println("Set après avoir supprimé 'Jane' : " + individuals);
    }
}