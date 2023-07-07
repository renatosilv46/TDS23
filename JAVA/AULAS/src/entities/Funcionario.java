package entities;

public class Funcionario {
	
	private String nomeFunc;
	private int codigoFunc;
	private double salarioFunc;
	private double descSalarioFunc;
	private String cargoFunc;
	

	public String getNomeFunc() {
		return nomeFunc;
	}


	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}


	public int getCodigoFunc() {
		return codigoFunc;
	}


	public void setCodigoFunc(int codigoFunc) {
		this.codigoFunc = codigoFunc;
	}


	public double getSalarioFunc() {
		return salarioFunc;
	}


	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}


	public double getDescSalarioFunc() {
		return descSalarioFunc;
	}


	public void setDescSalarioFunc(double descSalarioFunc) {
		this.descSalarioFunc = descSalarioFunc;
	}


	public String getCargoFunc() {
		return cargoFunc;
	}


	public void setCargoFunc(String cargoFunc) {
		this.cargoFunc = cargoFunc;
	}
	
	public double descontoFunc(double salarioFunc, double descSalarioFunc) {
		
		this.descSalarioFunc = descSalarioFunc;
		this.salarioFunc = salarioFunc;
		descSalarioFunc = salarioFunc * descSalarioFunc / 100;
		
				return(salarioFunc - descSalarioFunc);
	
	}
	
	
	
	

}
