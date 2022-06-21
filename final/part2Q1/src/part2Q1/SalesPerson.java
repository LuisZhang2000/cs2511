package part2Q1;

public class SalesPerson extends Employee {

	private float commission;
	private double salesTarget;
	private double salesAchieved;
	private int quota;

	public SalesPerson(String title, String firstName, String lastName, int quota) {
		super(title, firstName, lastName);
		this.salesTarget = quota; // removed quota from employee superclass
	}

	// cleaned up calculateSalary by calling getSalary method in Employee
	public double calculateSalary() {
		double totalSal;
		totalSal = getSalary() + commission * getSalesAchieved();
		return totalSal;
	}

	// copied from SalesHistory, SalesHistory is a lazy class
	public String getSalesSummary() {
		return getFirstName() + getLastName() + "Sales Target: " + getSalesTarget() + "$\n" +
			    "Sales to date: " + getSalesAchieved() + "$";
	}

	// copied from Employee class
	public double getSalesTarget() {
		return salesTarget;
	}

	// copied from Employee class
	public double getSalesAchieved() {
		return salesAchieved;
	}

}
