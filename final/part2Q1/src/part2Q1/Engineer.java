package part2Q1;

public class Engineer extends Employee {

    private double bonus;

    public Engineer(String title, String firstName, String lastName, int quota, double bonus) {
        super(title, firstName, lastName);
        this.bonus = bonus;
    }

    // cleaned up calculateSalary by calling getSalary method in Employee
    public double calculateSalary() {
        double totalSal;
        totalSal = getSalary() + bonus;
        return totalSal;
    }
}
