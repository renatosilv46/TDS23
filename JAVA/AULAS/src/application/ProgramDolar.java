package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class ProgramDolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double valorDolar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dolar = sc.nextDouble();
		
		System.out.print("Amount to be paid in reais = "+CurrencyConverter.valorDolar(dolar, valorDolar));
		
		
		

	}

}
