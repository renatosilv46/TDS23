
import java.util.Scanner;

public class CadAlunosFB {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String codigo[] = {"3278", "3277", "3317", "3274", "3269", "3316", "3272", "3319", "3266", "3332", "3330", "3262", "3275", "3280", "3337", "3263", "3281", "3339", "3264", "3340", "3321", "3276", "3318", "3268", "3282", "3343", "3258"};
		String auxCodigo;
		String numero[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27"};
		String nome[] = {"André de Castro Cruz", "André Henrique Marfin Ferreira", "Daniel P. dos Santos Silva", "Danilo Rezende da Silva", "Gabriel dos Anjos Correia da Silva", "Gabriel Marinho Guimarães", "Giovanna de Oliveira Scaglione", "Guilherme Adonario dos Santos", "Gustavo Henrique Torres e Silva", "Isabelle Cristina Dias Soares", "João Felipe Sena Nascimento", "João Pedro Mota Melára", "João Victor Alves Messias", "João Victor Bueno Ramalho", "João Vitor Rodrigues Martinez", "Jonatas Ferreira da Silva Pereira", "Júlio Henrique Scalete dos Santos", "Marcus Nunes de Campos", "Mateus Nezzi Ribeiro", "Matheus Nunes de Campos", "Moises Alves Bonfin", "Paulo Silas da Silva Santos", "Renato da Graça Silva", "Rodrigo de Andrade Montanholli", "Tiago de Lima Penaforte", "Vinícius Souza Santos", "Vitor Cruz dos Santos"};
		int faltas[]= new int[27];
		int auxFaltas = 0;
		double nota1[] = new double[27];
		double auxNota1 = 0.00; 
		double nota2[] = new double[27];
		double auxNota2 = 0.00;
		char todosAlunos;
		char op = ' ';
		char alterarTabela = ' ';
		
		System.out.print("Voce deseja utilizar o sistema de cadastro da turma de Tec DS? (S/N): ");
		op = leia.next().charAt(0);
		
		
		while(op == 'S') {
		System.out.print("\nDigite o codigo do aluno: ");
		auxCodigo = leia.next();
		
		for(int u=0; u<27; u++) {
			if(!auxCodigo.equals(codigo[u])) {
				System.out.print("Não tem nenhum aluno com este codigo...");
				
			}//if verifica codigo		
			break;
		}//for verifica codigo
	
		System.out.print("Digite a qtd de faltas deste aluno: ");
		auxFaltas = leia.nextInt();
		System.out.print("Digite a primeira nota do aluno: ");
		auxNota1 = leia.nextDouble();
		System.out.print("Digite a segunda nota do aluno: ");
		auxNota2 = leia.nextDouble();
		System.out.print("Deseja visualizar todos os alunos? (S/N)");
		todosAlunos = leia.next().toUpperCase().charAt(0);
		
		
	
		//incrementar faltas e notas
				for(int y=0; y<27; y++) {
					
				
					
					if(auxCodigo.equals(codigo[y])) {
						faltas[y]+= auxFaltas;
						nota1[y] = auxNota1;
						nota2[y] = auxNota2;
					}//if Notas
				}//for Notas
		
		
				if(todosAlunos == 'S') {
			for(int i=0; i<27; i++)
				System.out.print("\nCodigo do aluno: "+codigo[i]+"\nNumero do aluno: "+numero[i]+"\nEste e o nome do aluno: "+nome[i]+"\nEste e o numero de faltas: "+faltas[i]+"\nEsta e a primeira nota do aluno: "+nota1[i]+"\nEsta e a segunda nota do aluno: "+nota2[i]);
				
					
				}//if todos alunos
				
				else {
			//visualizar aluno especifico
			for(int x=0; x<27; x++) {
				if(auxCodigo.equals(codigo[x])) {
				System.out.print("Codigo do aluno: "+codigo[x]+"\nNumero do aluno: "+numero[x]+"\nEste e o nome do aluno: "+nome[x]+"\nEste e o numero de faltas: "+faltas[x]+"\nEsta e a primeira nota do aluno: "+nota1[x]+"\nEsta e a segunda nota do aluno: "+nota2[x]);
				
				}//if
					
			}//for	
		}//else
		
				System.out.print("\nVoce deseja continuar alterando a tabela? (S/N)");
				op = leia.next().charAt(0);
			
				
	
	
	}//while	} 
		
		
		System.out.println("Fim de programa!");

	}//main

}//class
