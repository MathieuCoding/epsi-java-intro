package Exo2;

import java.util.Objects;

public class Circle extends GeometricalShape {
    public int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void display() {
        System.out.println("Circle Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Circle circle = (Circle) object; // Cast object to Circle
        return radius == circle.radius;
    }
}
