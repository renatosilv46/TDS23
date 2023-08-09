package app;

import java.util.Locale;

import entities.Conta;
import entities.Especial;

public class TestEspecial {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Especial especial = new Especial(335,"123.456.789.87");
		
		especial.credito(100.00);
		
		especial.usarLimite(150.00);
	}

}
