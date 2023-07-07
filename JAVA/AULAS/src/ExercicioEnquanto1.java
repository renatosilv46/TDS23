import java.util.Scanner;

public class ExercicioEnquanto1 {

	public static void main(String[] args) {
		
		final String senha = "1234";
		String teste;
		int numero = 0;
		int total = 0;
		
		System.out.print("Digite a senha: ");
		Scanner sc = new Scanner(System.in); 
		teste = sc.next();
			  
			
			while(teste == senha) {
				
				System.out.print("Digite um número: ");
					numero = sc.nextInt();
					if(numero < 0) {
						break;
					}
					total+=numero;
					
			}
		
		System.out.print("\nTotal de numeros: "+total);
		System.out.print("Fim de programa!!!");	
	}
}
