public class BonusCalculator {

    public double calculateBonus(Employee employee, double percentage) {
        return employee.getSalary() * percentage / 100;
    }
}
