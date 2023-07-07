package application;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double mediaIdade = 0.00;
		double mediaAltura = 0.00;
	
		System.out.println("Quantas pessoas serão cadastradas?: ");
		n = sc.nextInt();
		
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		
		//Ler nomes
		for(int i=0; i<n; i++) {
			
			System.out.println("Dados da "+(i+1)+"a pessoa: ");
			
			System.out.println("Nome: ");
			nome[i] = sc.next(); 
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
			System.out.println("Altura: ");
			altura[i] = sc.nextDouble();
			}
		
		
		for(int i=0; i<n; i++){
			
			mediaIdade += idade[i];
			
		}
		
		mediaIdade = mediaIdade / n;
		
		
		for(int i=0; i<n; i++) {
			
			mediaAltura += altura[i];
	
		}
		
		mediaAltura = mediaAltura / n;
		
		System.out.printf("A media de idade e: %.2f",mediaIdade);
		
		System.out.printf("\nA media de altura e: %.2f",mediaAltura);
		
		
		
		

	}

}
