package entities;

import org.junit.jupiter.api.Assertions;

public class Produto {
	
	//Attributes
	private String codigo;
	private double valor;
	private String nome;
	private int estoque;
	private int qtde;
	
	
	//Constructor
	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.nome = nome;
		this.estoque = estoque;
	}


	//Getters and Setters
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public void setDescricao(String nome) {
		this.nome = nome;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	
	//Method
	public void tirarEstoque(int qtde) {
		if(qtde > this.estoque) {
			System.out.println("Quantidade informada invalida.");
		
		}else if(qtde <= 0) {
			System.out.println("Quantidade informada invalida.");
		
		}else {
			this.estoque -= qtde;	
		}
		
	}
	
	public void incluirEstoque(int qtde) {
		if(qtde <= 0) {
			System.out.println("Quantidade informada invalida.");
		}
		
		this.estoque += qtde;
		
	}


	@Override
	public String toString() {
		return 
				"\nDescricao: " + nome + 
				"\nCodigo: " + codigo +
				"\nValor: " + valor + 
				"\nEstoque: " + estoque;
	}
	


}
