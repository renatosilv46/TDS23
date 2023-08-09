package entities;

public class Empresa extends Conta {

   
private double emprestimoEmpresa;

public Empresa(int numero, String cpf, double emprestimoEmpresa) {
       super(numero, cpf);
       this.emprestimoEmpresa = emprestimoEmpresa;
   }

   public double getEmprestimoEmpresa() {
       return emprestimoEmpresa;
   }

   public void setEmprestimoEmpresa(double emprestimoEmpresa) {
       this.emprestimoEmpresa = emprestimoEmpresa;
   }

public void emprestimo(double valor){
   
   if(valor > getEmprestimoEmpresa()) {
       
       System.out.println("Valor negado!");
   }
   
   else if(valor < getEmprestimoEmpresa()) {
       
       System.out.println("Emprestimo aprovado!");
        this.emprestimoEmpresa -= valor;
        super.credito(valor);
   }
}


}
