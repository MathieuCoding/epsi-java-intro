package Exo2;

public class Rectangle extends GeometricalShape{
    public int length;
    public int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    @Override
    public void display() {
        System.out.println("Rectangle area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter());
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object; // Cast object to Rectangle
        return length == rectangle.length && width == rectangle.width;
    }
}
