import java.util.Scanner;

public class TesteJava {
	
	public static void main(String[] args) {
		
		//Variáveis
		String times[] = {"SPFC","SFC","SCCP","SEP"};
		int pontos[] = {0,0,0,0};
		String resultado;
		String auxTime="";
		
		for(int i=1; i<=3; i++) {
			System.out.print("Rodada: "+i);
			System.out.print("\n");	
			
			for(int x=0; x<4; x++) {
				System.out.print(times[x]+"\n");
				System.out.print("Digite G 'Ganhou', E 'Empate', P 'Perdeu' : ");
				Scanner ler = new Scanner(System.in);
		         resultado = ler.next();
		         
		         if(resultado == "G" || resultado == "g") {
		        	 pontos[x] += 3;
		         }else if(resultado == "E" || resultado == "e"){
		        	 pontos[x] += 1;
		         }else if(resultado == "P" || resultado =="p") {
		        	 pontos[x] += 0;
		         }   
		     }
		}System.out.print("Times\tPontos\n");
		for(int z=0; z<4; z++) {
			System.out.print(times[z]+"\t"+pontos[z]+"\n");
			
		}
		
		
	}

}
