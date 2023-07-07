package application;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] positivo = new int[10];
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Digite um numero: ");
			positivo[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos: ");
		
		for(int x=0; x<10; x++) {
			if(positivo[x] < 0) {
				
				System.out.println(positivo[x]);
			}
			
		}
		
		
		

	}

}
