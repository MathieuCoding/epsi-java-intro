package Exo1;

public class Main {
    public static void main(String... args) {
        Personne Jean = new Personne(); // Uses empty constructor
        Jean.name = "Jean";
        Jean.age = 35;
        Personne Lucie = new Personne("Lucie", 25);
        Personne Julien = new Personne("Julien", 20);
        Personne Toto = new Personne("Toto", 40);
        Personne Lulu = new Personne("Lulu", 12);

        Jean.afficherDetails();
        Lucie.afficherDetails();
        Julien.afficherDetails();
        Toto.afficherDetails();
        Lulu.afficherDetails();
    }
}
