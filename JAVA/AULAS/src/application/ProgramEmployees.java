package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class ProgramEmployees {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Variáveis
		Integer id;
		String name;
		Double salary;
		int auxFor;
		
		
		System.out.println("How many employees will be registered?: ");
		auxFor = sc.nextInt();
		
		List <Employees> list  = new ArrayList<>();
		
		for(int i=0; i<auxFor; i++) {
			
			System.out.println("Digite o ID:");
			id = sc.nextInt();
			System.out.println("Digite o nome: ");
			name = sc.next();
			System.out.println("Digite o salario: ");
			salary = sc.nextDouble();
			list.add(new Employees(id,name,salary));
			
		}
		
		for(Employees e : list) {
			
			System.out.print(e);
			
		}
		
		

	}

}
