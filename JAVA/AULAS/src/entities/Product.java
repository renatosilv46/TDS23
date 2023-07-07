package entities;

public class Product {
	
	//ATRIBUTOS
	private String name;
	private double price;
	private int quantity;
	
	//MÉTODOS
	public double totalValueInStock() {
		
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price) //Estou formatando o valor decimal de price para um tipo string imprimindo como texto;
				+", "
				+ quantity
				+" untis, Total: $ "
				+ String.format("%.2f", totalValueInStock());		
	}

	//ENCAPSULAMENTO (GETTERS AND SETTERS)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
