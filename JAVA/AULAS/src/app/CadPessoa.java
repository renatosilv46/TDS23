package app;

import java.util.Scanner;

import entities.Pessoa;

public class CadPessoa {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa1 = new Pessoa();
		char op=' ';
		int anoAtual;
	
		System.out.print("Digite o nome da pessoa: ");
		pessoa1.nome = sc.nextLine();
		
		System.out.print(pessoa1.nome+" digite o seu 'CPF': ");
		pessoa1.cpf = sc.next();
		
		
		
		System.out.println("Esta pessoa esta viva? (S/N): ");
		op = sc.next().toUpperCase().charAt(0);
		
		if (op == 'S')
			pessoa1.vivo = pessoa1.vivo = true;
		else
			pessoa1.vivo = pessoa1.vivo = false;
		
		System.out.println("Digite o seu ano atual: ");
		anoAtual = sc.nextInt();
		
		System.out.printf("Ola %s, sua idade aproximada e %d",pessoa1.nome, pessoa1.retornarIdade(anoAtual));
		
		
		
		
		
		
	}

}
