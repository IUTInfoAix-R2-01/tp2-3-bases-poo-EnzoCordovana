package tp2exosYaip1;

public class Employee {
	// Attributes
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	// Constructor
	Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	// Methods
	
	/*
	 * @return id			Employee id
	*/
	public int getId() {
		return this.id;
	}

	/*
	 * @return firstName 	Employee's first name 
	*/
	public String getFirstName() {
		return this.firstName;
	}

	/*
	 * @return firstName 	Employee's last name
	*/
	public String getLastName() {
		return this.lastName;
	}
	
	/*
	 * @return firstName 	Employee's first name and last name
	*/
	public String getName() {
		return this.firstName + " " + this.lastName;
	}

	/*
	 * @return firstName 	Employee's salary
	*/
	public int getSalary() {
		return salary;
	}
	
	/*
	 * @param newSalary		Define the new salary
	 * @return void
	*/
	public void setSalary(int newSalary) {
		this.salary = newSalary;
	}
	
	/*
	 * @return salary		Employee's annual salary 
	*/
	public int getAnnualSalary() {
		return this.salary * 12;
	}
	
	/*
	 * @param percent		Percentage of salary increase
	 * @return salary		Employee's salary
	*/
	public int raiseSalary(int percent) {
		this.salary = this.salary * (percent/100);
		return this.salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + firstName + " " + lastName + ", salary=" + salary + "]";
	}
	
}
