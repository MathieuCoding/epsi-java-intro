package Exo3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Garfield");
        Dog dog = new Dog("Milou");
        cat.displayInfos();
        cat.emitSound();
        dog.displayInfos();
        dog.emitSound();
        System.out.println("New update thaaaaaaanks !!!");
    }
}
