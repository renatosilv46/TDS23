package entities;

public class Especial extends Conta {

	// ATTRIBUTES
	private double limite;

	// CONSTRUCTOR
	public Especial(int numero, String cpf) {
		super(numero, cpf);
		this.limite = 1000.00;
	}

	// GETTERS AND SETTERS
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// METHOD
	public void usarLimite(double valor) {

		/*
		 * System.out.println("\nValor a ser debitado da conta: "+valor);
		 * System.out.println("-----------------------------------------------");
		 * 
		 * if(valor > this.getSaldo() && valor < this.limite) {
		 * 
		 * double valorExcedente = valor - this.getSaldo();
		 * 
		 * super.debito(getSaldo());
		 */
		this.limite -= valor;
		super.credito(valor);
		System.out.println(" || Limite: " + this.limite);

		System.out.println("-----------------------------------------------");

	}

	@Override
	public void debito(double valor) {
		double dif = 0.00;
		if (this.ativo != true) {
			System.out.println("Ative uma conta");
		} else if (valor <= 0) {
			System.out.println("Valor negativo ou zerado...");
		} else if (valor > (this.saldo + this.limite)) {

			System.out.println("\nImpossível realizar esta ação.");
		} else {
			dif = valor - this.saldo;
			usarLimite(dif);
			this.saldo -= valor;
			System.out.println("\tSALDO ATUALIZADO");
			System.out.printf("Saldo atual : " + this.saldo);
			System.out.printf(" || Limite: " + this.limite);
			System.out.printf("\n-----------------------------------------------");
		}
	}
}