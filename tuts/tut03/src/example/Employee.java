package example;

/**
 * An employee in the HR system
 * 
 * @author Luis Zhang
 */
public class Employee {
    /**
     * this is the name of the employee
     */
    private String name;
    /**
     * this is the salary of the employee
     */
    private int salary;

    /**
     * <p> This is an Employee constructor
     * <img src="h"ttps://vignette.wikia.nocookie.net/hello-yoshi/images/5/59/Beeg_Yoshi.png/revision/latest/scale-to-width-down/340?cb=20200223184010" alt="An employee">
     * </p>
     * 
     * @see <a href="https://www.gmail.com">Gmail</a>
     * 
     * @since 1.0
     * 
     * @param name name of the employee
     * @param salary salary of the employee
     */

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * getter method to extract employee
     * 
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * setter method to set name
     * 
     * @param name the name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter method to extract salary
     * 
     * @return the salary of the employee
     */
    public int getSalary() {
        return salary;
    }

    /**
     * setter method to set salary
     * 
     * @param salary the salary of the employee
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public string toString() {
        return getClass().toString()+", name = " + name + ", salary = " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Employee e = (Employee) obj;
        return (name.equals(e.name) && salary == e.salary);
    }

}

