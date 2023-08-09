package entities;

public class Corrente extends Conta {
   
   private int contadorTalao = 3;
   

   public Corrente(int numero, String cpf, int contadorTalao) {
       super(numero, cpf);
       this.contadorTalao = contadorTalao;
   }



   public int getContadorTalao() {
       return contadorTalao;
   }



   public void setContadorTalao(int contadorTalao) {
       this.contadorTalao = contadorTalao;
   }



   public void pediTalao(int qtdeCheque) {
       
       if(qtdeCheque > this.contadorTalao) {
           System.out.println("Você só tem direito a 3 talões...");
       }
       else if( (qtdeCheque * 30)<=super.getSaldo()) {
           System.out.println("Imprimindo talões...");
           super.debito(qtdeCheque*30);
       }
       else
       {
           System.out.println("Saldo indisponivel para geração de taloes");
       }
       
   }

}