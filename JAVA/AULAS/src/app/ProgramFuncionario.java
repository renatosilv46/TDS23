package app;

import java.util.Scanner;

import entities.Funcionario;

public class ProgramFuncionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario func1 = new Funcionario();
		
		System.out.println("Digite o primeiro nome do funcionario que voce deseja cadastrar: ");
		func1.setNomeFunc(sc.next());
		
		System.out.println("Digite o codigo que voce deseja setar neste funcionario: ");
		func1.setCodigoFunc(sc.nextInt());
		
		System.out.print("Digite o cargo que este funcionario exerce: ");
		func1.setCargoFunc(sc.next());
		
		System.out.println("\nDigite o valor do salario equivalente a este cargo, e a taxa em % de desconto do salario deste funcionario: ");
		func1.descontoFunc(sc.nextDouble(), sc.nextDouble());
		
		for(int i=0; i<50; i++) {
			System.out.print("-");
		}
		
		System.out.println("\nFicha do funcionario "+func1.getCodigoFunc()+" deste mes: ");
		
		for(int i=0; i<50; i++) {
			System.out.print("-");
		}
		
		System.out.println("\nCodigo: "+func1.getCodigoFunc());
		System.out.println("Nome: "+func1.getNomeFunc());
		System.out.println("Cargo/Funcao: "+func1.getCargoFunc());
		System.out.println("Sub-Salario: "+func1.getSalarioFunc()+"$");
		System.out.println("Desconto no salario deste mes: "+func1.getDescSalarioFunc()+"%");
		
		double valorFinal = (func1.getSalarioFunc() * func1.getDescSalarioFunc() / 100);
		
		System.out.println("Salario final: "+(func1.getSalarioFunc()-valorFinal)+"$");
		
		for(int i=0; i<50; i++) {
			System.out.print("-");
		}
	
		
	}

}
