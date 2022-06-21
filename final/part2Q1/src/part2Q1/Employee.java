package part2Q1;

public class Employee {
	private String title;
	private String firstName;
	private String lastName;
	//private double salesTarget; 	refused bequest
	//private double salesAchieved;		refused bequest
	private double baseSalary;

	// salesTarget, quota are refused bequest
	public Employee (String title, String firstName, String lastName) {
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		//this.salesTarget = quota; 	refused bequest
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	// public double getSalesTarget() {		REFUSED BEQUEST
	// 	return salesTarget;
	// }

	public String getTitle() {
		return title;
	}

	// public double getSalesAchieved() {	REFUSED BEQUEST
	// 	return salesAchieved;
	// }

	public double getBaseSalary() {
		return baseSalary;
	}

	public double calculateTax() {
		double tax = 0;
		double salary = baseSalary;
		if (salary > 50000) {
		    tax += 0.3*(salary - 50000);
		}
		if (salary > 30000) {
		    tax += 0.2*(salary - 30000);
		}
		return tax;
	}

	public double calculateParkingFringeBenefits() {
		return (baseSalary - 50000) / 10000;
	}

	// new method for getting salary (get rid of duplicate code)
	public double getSalary() {
		return baseSalary + calculateParkingFringeBenefits() - calculateTax();
	}


}
