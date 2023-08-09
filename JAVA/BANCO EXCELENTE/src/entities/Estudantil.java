package entities;

public class Estudantil extends Conta {
   
   private double limiteEstudantil;
   
   
   public Estudantil(int numero, String cpf, double limiteEstudantil) {
       super(numero, cpf);
       this.limiteEstudantil = limiteEstudantil;
   }


   public double getLimiteEstudantil() {
       return limiteEstudantil;
   }


   public void setLimiteEstudantil(double limiteEstudantil) {
       this.limiteEstudantil = limiteEstudantil;
   }
   
   
   public void usarEstudantil(double valor) {
       
       if(valor > getLimiteEstudantil()) {
           System.out.println("Valor negado!");            
           
       }else if(valor < getLimiteEstudantil()) {
           System.out.println("Emprestado aprovado!");
           this.limiteEstudantil -= valor;
           super.credito(valor);
           
           
       }
       
   }
}