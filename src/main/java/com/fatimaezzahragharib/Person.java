package com.fatimaezzahragharib;

import java.util.Objects;

public class Person {
    private int id;
    private String name;

    // Constructeur
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Ajoutez cette méthode pour accéder au champ name
    public String getName() {
        return name;
    }

    // Méthode equals pour comparer les objets Person
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    // Méthode hashCode pour obtenir un code de hachage unique basé sur l'id
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Méthode toString pour afficher les informations de la personne sous forme de
    // chaîne
    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }
}
