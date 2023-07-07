package entities;

public class Conta {
	
	private int accountNumber;
	private String accountHolder;
	private double valueInitial;
	final private  double TAXA = 5.00;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getValueInitial() {
		return valueInitial;
	}

	public void setValueInitial(double valueInitial) {
		this.valueInitial = valueInitial;
	}

	public double getTAXA() {
		return TAXA;
	}

	public double saque(double valueSaque) {
		
		this.valueInitial = valueInitial;
		return(valueInitial - valueSaque - TAXA);
	}
	
	public double deposito(double valorDepositado) {
		
		return(this.valueInitial += valorDepositado);
		
	}
	
	
	
	

}
