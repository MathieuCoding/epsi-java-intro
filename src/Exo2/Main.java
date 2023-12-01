package Exo2;

public class Main {
    public static void main(String[] args) {
        GeometricalShape[] shapes = new GeometricalShape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Circle(10);
        shapes[2] = new Rectangle(5, 10);
        shapes[3] = new Rectangle(10, 20);

        double totalArea = 0;
        double totalPerimeter = 0;

        for (GeometricalShape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
            shape.display();
        }

        System.out.println("Total area: " + totalArea);
        System.out.println("Total perimeter: " + totalPerimeter);
    }
}
