public class Main {

    public static void main(String[] args) {
        Shape shape = new Rectangle(10, 20);
        System.out.println("Area of rectangle: " + shape.getArea());

        shape = new Square(10);
        System.out.println("Area of square: " + shape.getArea());

        shape = new Circle(10);
        System.out.println("Area of circle: " + shape.getArea());

        // Open-closed principle
        // Here, we can add new shapes without modifying the existing code

    }
}
