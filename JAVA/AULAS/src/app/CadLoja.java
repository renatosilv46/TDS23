package app;

import java.util.Scanner;

import entities.Produto;

public class CadLoja {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Produto prod1 = new Produto();
		char op = ' ';
		int qtde = 0;
		
		System.out.print("Digite o codigo do produto que voce quer cadastrar: ");
		prod1.codigo = sc.next();
		
		System.out.print("Digite a descricao do produto: ");
		prod1.descricao = sc.next();
		
		System.out.print("Digite o valor unitario do produto:  ");
		prod1.valorUnitario = sc.nextDouble();
		
		System.out.print("Digite a quantidade em estoque deste produto: ");
		prod1.estoque = sc.nextInt();
		
		System.out.println("\nInformacoes do nosso estoque relacionado ao produto :\n"+prod1.codigo+"\n"+prod1.descricao+"\n"+prod1.estoque+"\n"+prod1.valorUnitario);
		
		
		System.out.print("\nVoce deseja atualizar o estoque deste produto? (A - aumentar / T - tirar / N - finalizar o programa:");
		op = sc.next().toUpperCase().charAt(0);
		
		
		
		if(op == 'A') {
			
			System.out.print("Digite a quantidade de produto que voce quer incluir no estoque: ");
			qtde = sc.nextInt();
			prod1.IncluirEstoque(qtde);
			
			System.out.println(prod1.codigo+"\n"+prod1.descricao+"\n"+prod1.estoque+"\n"+prod1.valorUnitario);
			
		}else if(op == 'T') {
			qtde = sc.nextInt();
			prod1.tirarEstoque(qtde);
		System.out.print("O total de "+prod1.descricao+" que voce ira retirar do estoque custara: "+(qtde * prod1.valorUnitario));
			
		}
		

	}

}
