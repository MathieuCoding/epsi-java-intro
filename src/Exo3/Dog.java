package Exo3;

public class Dog implements Animal{
    public String name;
    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void emitSound() {
        System.out.println("Woof Woof");
    }
    @Override
    public void displayInfos() {
        System.out.println("Dog name: " + this.name);
    }
}
