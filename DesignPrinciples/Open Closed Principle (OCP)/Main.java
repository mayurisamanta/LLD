public class Main {

    public static void main(String[] args) {
        Employee employee = new Manager("John Doe", 100000);
        System.out.println("Bonus: " + employee.calculateBonus());

        employee = new Developer("Mary Jane", 60000);
        System.out.println("Bonus: " + employee.calculateBonus());
    }
}
