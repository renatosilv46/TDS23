package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
			Scanner sc = new Scanner(System.in);
			
			int n;
			double soma, media;
			
			System.out.println("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();
			
			double[] vetor = new double[n];
			
			for(int i=0; i<n; i++) {
				
				System.out.println("Digite um numero: ");
				vetor[i] = sc.nextDouble();	
			}
			
			soma = 0;
			for(int o=0; o<n; o++) {
				
				soma += vetor[o];
				
			}
			
			media  = soma / n;
			
			System.out.println("Valores: ");
			
		for(int x=0; x<n; x++) {
			
			System.out.printf("%.1f ",vetor[x]);
			
		}
		
		System.out.printf("\nSoma: %.2f\n",soma);
		System.out.printf("Media: %.2f\n ",media);
			
		sc.close();
	}
 }


