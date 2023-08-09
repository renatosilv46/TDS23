package entities;

public class Employees {

	private Integer id;
	private String name;
	private double salary;

	// Constructor
	public Employees(Integer id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ID:"+ id +"\nName:" +name+"\nSalary: "+salary;
	}

	

	
	
}
