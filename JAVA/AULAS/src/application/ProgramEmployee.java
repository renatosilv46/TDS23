package application;

import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.setName(sc.next());
		
		System.out.print("Gross Salary: ");
		employee.setGrossSalary(sc.nextDouble());
		
		System.out.println("Tax: ");
		employee.setTax(sc.nextDouble());
		
		System.out.println("Employee: "+employee.toString());
		
		System.out.println("Which percentage to increase salary?: ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: "+employee.toString());
	}

}
