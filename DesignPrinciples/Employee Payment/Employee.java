public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    // SRP: Here, the Employee class is responsible for storing the employee details.
    // It is not responsible for calculating the bonus.
    // The BonusCalculator class is responsible for calculating the bonus.
    // This is an example of the Single Responsibility Principle.

}
