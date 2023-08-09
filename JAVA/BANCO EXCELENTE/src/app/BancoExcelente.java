package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Empresa;
import entities.Estudantil;
import entities.Corrente;
import entities.Especial;
import entities.Poupanca;

public class BancoExcelente {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // metodo estatico - interface

		Scanner leia = new Scanner(System.in);

		double valor = 0.00;
		char op;
		char tipoconta;

		do {
			System.out.println("| BANCO EXCELENTE |");
			System.out.println("AQUI O SEU DINHEIRO E A NOSSA EXCELENCIA...");

			System.out.println("1-Poupanca\n2-Corrente\n3-Especial\n4-Empresa\n5-Estudantil\n6-Sair");
			tipoconta = leia.next().charAt(0);

			if (tipoconta == '1') {
				// Poupança João Senna N 11
				Poupanca p1 = new Poupanca(123, "123.456.789-10", 10);

				p1.ativar();

				System.out.println("Saldo atual conta : " + p1.getSaldo());

				for (int x = 1; x <= 10; x++) {

					System.out.println("\nMovimento " + x);

					System.out.print("\nDigite o valor : ");

					valor = leia.nextDouble();

					System.out.print("Digite D-débito ou C-crédito : ");

					op = leia.next().toUpperCase().charAt(0);

					if (op == 'C') {

						p1.credito(valor);
					} else if (op == 'D') {

						p1.debito(valor);
					}

				}

				System.out.println("\nDigite o dia atual: ");
				int diaAtual = leia.nextInt();
				p1.correcao(diaAtual);

			} else if (tipoconta == '2') {
				// Corrente Tiago N 25
				Corrente c2 = new Corrente(02, "987.654.321-10", 3);
				int qtdeCheque = 0;
				c2.ativar();
				for (int x = 1; x <= 10; x++) {
					System.out.println("\nMovimento " + x);
					System.out.println("Digite o valor : ");
					valor = leia.nextDouble();
					System.out.println("Digite D-debito ou C-credito : ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'C') {
						c2.credito(valor);
					} else if (op == 'D') {
						c2.debito(valor);
					}
				}
				System.out.println("\nDeseja solicitar um cheque S/N : ");
				op = leia.next().toUpperCase().charAt(0);
				if (op == 'S') {

					System.out.println("Digite o numero de cheques(limite 3) :");

					qtdeCheque = leia.nextInt();
					while (qtdeCheque <= 0 || qtdeCheque > 3) {
						System.out.println("Valor incorreto, tente novamente : ");
						qtdeCheque = leia.nextInt();
					}
					System.out.println("Debitando da sua conta: " + qtdeCheque * 30);
					c2.pediTalao(qtdeCheque);

				}
				System.out.println("\nSaldo atual conta corrente : " + c2.getSaldo());
				System.out.println("---------------------------------------------------");

			} else if (tipoconta == '3') {
			//Especial Renato Da Graça N 23
				
				Especial ep1 = new Especial(123,"444.333.555-10");

				ep1.ativar();

				for(int x=1;x<=3;x++) {

				System.out.println("\nMovimento "+x);
				System.out.print("\nDigite o valor: ");
				valor = leia.nextDouble();
				System.out.print("Digite D(DEBITO) OU C(CREDITO): ");
				op = leia.next().toUpperCase().charAt(0);
				
				if(op =='C') {
				ep1.credito(valor);
				System.out.println(" | Limite: "+ep1.getLimite());
				System.out.println("-----------------------------------------------");
			
				}else if (op =='D') {
				ep1.debito(valor);
				}

				}

				}else if (tipoconta == '4') {
				// Empresa Gulherme Adonario N 8
				Empresa Empresa = new Empresa(0, "444.444.444-12", 10000.0);

				Empresa.ativar();
				for (int x = 1; x <= 10; x++) {
					System.out.println("\nMovimento " + x);
					System.out.print("\nDigite o valor : ");
					valor = leia.nextDouble();
					System.out.print("Digite D-débito ou C-crédito : ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'C') {
						Empresa.credito(valor);
					} else if (op == 'D') {
						Empresa.debito(valor);
					}

					System.out.println("Saldo atual : " + Empresa.getSaldo());
				}
				System.out.println("Deseja um emprestimo!!??\n");
				System.out.println("\nSaldo atual da sua conta é: " + Empresa.getSaldo());
				System.out.println("Seu limite para emprestimo é: " + Empresa.getEmprestimoEmpresa());
				System.out.println("\nDigite o valor desejado: ");
				Empresa.emprestimo(leia.nextDouble());
				System.out.println("\nSaldo atual da sua conta é: " + Empresa.getSaldo());
				System.out.println("Seu limite para emprestimo é: " + Empresa.getEmprestimoEmpresa());

			} else if (tipoconta == '5') {
				// Estudantil Moises Bonfin N 21

				Estudantil et1 = new Estudantil(1, "222.222.222-22", 5000.00);

				et1.ativar();

				System.out.println("Saldo atual conta : " + et1.getSaldo());
				for (int x = 1; x <= 10; x++) {
					System.out.println("\nMovimento " + x);
					System.out.print("\nDigite o valor : ");
					valor = leia.nextDouble();
					System.out.print("Digite D-débito ou C-crédito : ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'C') {
						et1.credito(valor);
					} else if (op == 'D') {
						et1.debito(valor);
					}
					// System.out.println("Saldo atual : "+et1.getSaldo());
					System.out.println("\nSaldo atual estudantil: " + et1.getLimiteEstudantil());
				}

				System.out.println("\nSaldo atual limite estudantil " + et1.getLimiteEstudantil());
				System.out.println("Seu limite para emprestimo é: " + et1.getLimiteEstudantil());
				System.out.println("\nDigite o valor desejado: ");
				et1.usarEstudantil(leia.nextDouble());
				System.out.println("\nSaldo atual da sua conta é: " + et1.getSaldo());
				System.out.println("Seu limite para emprestimo é: " + et1.getLimiteEstudantil());

			} else {
				System.out.println("Obrigado!");
				break;
			}

		} while (true);

	}

}