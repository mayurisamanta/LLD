public class Main {

    public static void main(String[] args) {
        Shape square = new Square(5);
        System.out.println("Area of square: " + square.calculateArea());

        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.calculateArea());

        // Here we are not repeating the code to calculate the area of square and circle
        // We are using the calculateArea method of the Shape interface
        // This is an example of DRY principle
    }


}
