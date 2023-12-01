package Exo1;

import java.util.Objects;

public class Personne {
    public String name;
    public int age;
    // Constructor
    public Personne() {}
    // Constructor
    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void afficherDetails() {
        System.out.println("Nom: " + this.name);
        System.out.println("Age: " + this.age);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Personne personne = (Personne) object; // Cast object to Personne
        return age == personne.age && Objects.equals(name, personne.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

