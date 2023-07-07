package entities;

public class Pessoa {

	public String cpf;
	public String nome;
	public boolean vivo;
	public int anoNascimento;
	
	public void MostraIdade() {
	System.out.println(this.nome+" sua idade e: "+(2023 - this.anoNascimento));
	
	}
	
	public int retornarIdade(int anoAtual) {
		
		
		
		return(anoAtual - this.anoNascimento);
		
		
	}
	
}
