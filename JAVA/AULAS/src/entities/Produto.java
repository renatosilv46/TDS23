package entities;

public class Produto {

	public String codigo;
	public String descricao;
	public double valorUnitario;
	public int estoque;
	
	public void IncluirEstoque(int qtde) {
		
		this.estoque += qtde;
		
	}
		public void tirarEstoque(int qtde) {
			
			this.estoque -= qtde;
			
		}
	
}

