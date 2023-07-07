package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ProgramSaque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		char op = ' ';
		double valueInitial = 0.00;
		double valorDepositado = 0.00;
		double valueSaque = 0.00;
		
		Conta conta = new Conta();
		
		System.out.println("Enter account number: ");
		conta.setAccountNumber(sc.nextInt());
		
		System.out.println("Enter account holder: ");
		conta.setAccountHolder(sc.next());
		
		System.out.println("Is there na initial deposit? (Y/N): ");
		op = sc.next().charAt(0);
	
		
				if(op == 'Y') {
					System.out.println("Enter initial deposit value: ");
					valorDepositado = sc.nextDouble();
					conta.deposito(valorDepositado);
					System.out.println("Account: "+conta.getAccountNumber()+", Holder: "+conta.getAccountHolder()+", Balance: "+conta.getValueInitial());
				}else if(op == 'N') {
					System.out.println("Account data: ");
					System.out.println("Account: "+conta.getAccountNumber()+", Holder: "+conta.getAccountHolder()+", Balance: "+conta.getValueInitial());
				}
		
		
				System.out.println("If you want to withdraw type 'W', if you want to deposit type 'D': ");
				op = sc.next().charAt(0);
		
				
				while(op == 'W' || op == 'D') {
					
				
				if(op == 'W'){
			
					System.out.println("Enter a withdraw value: ");
					valueSaque = sc.nextDouble();
					conta.saque(valueSaque);
					System.out.println("If you want to withdraw type 'W', if you want to deposit type 'D': ");
					op = sc.next().charAt(0);
					}
				else if(op == 'D'){
					
					System.out.println("Enter a deposit value: ");
					valorDepositado = sc.nextDouble();
					conta.deposito(valorDepositado);
					System.out.println("Account: "+conta.getAccountNumber()+", Holder: "+conta.getAccountHolder()+", Balance: "+conta.getValueInitial());
					System.out.println("If you want to withdraw type 'W', if you want to deposit type 'D': ");
					op = sc.next().charAt(0);
			   }
				
		   }
	   }
   }
