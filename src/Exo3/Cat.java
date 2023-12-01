package Exo3;

public class Cat implements Animal{
    public String name;
    public Cat(String name) {
        this.name = name;
    }
    @Override
    public void emitSound() {
        System.out.println("Meow meow");
    }
    @Override
    public void displayInfos() {
        System.out.println("Cat name: " + this.name);
    }
}
