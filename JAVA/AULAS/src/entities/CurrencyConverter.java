package entities;

public class CurrencyConverter {
	
	public static double valorDolar(double dolar, double valorDolar) {
		
		double valorReais = (dolar * valorDolar);
		double totalValorReais = valorReais+(valorReais * 0.06);
		
		return totalValorReais;
		
	}
	
	
	

}
