package entities;

public class Employee {

	private String name;
	private double grossSalary;
	private double tax;
	

	
	//METODOS
	public double netSalary() {
		return this.grossSalary - this.tax;
		
	}
	public void increaseSalary(double percentage) {
		
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
	
	//ENCAPSULAMENTO

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	


}

