package entities;

public class Poupanca extends Conta {
private int diaAniversarioPoupanca;

   public Poupanca(int numero, String cpf,int diaAniversarioPoupanca) {
   super(numero, cpf);
   this.diaAniversarioPoupanca = diaAniversarioPoupanca;
   }

   public void correcao(int diaAtual) {
       
       if(this.diaAniversarioPoupanca == diaAtual) {
           
           double porcento = (super.getSaldo() * 0.005);
           super.credito(porcento);
       
       }
   
   }
}