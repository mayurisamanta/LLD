public class Main {

    public static void main(String[] args) {
        Shape shape = new Rectangle(10, 20);
        System.out.println("Area of rectangle: " + shape.getArea());

        shape = new Square(10);
        System.out.println("Area of square: " + shape.getArea());

        shape = new Circle(10);
        System.out.println("Area of circle: " + shape.getArea());

        // Here, we can see that the Rectangle, Square, and Circle classes are implementing the Shape interface.
        // The Rectangle and Square classes are implementing the getArea() method in a way that is consistent with the Liskov Substitution Principle.
        // The Circle class is also implementing the getArea() method in a way that is consistent with the Liskov Substitution Principle.
        // The getArea() method is returning the area of the respective shapes.

    }
}
