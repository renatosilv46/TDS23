package entities;
public abstract class Conta {
   //ATTIRUBTES
    private int numero;
    private String cpf;
    protected double saldo;
    protected boolean ativo = false;
   
   
   
    //CONSTRUCTOR
    public Conta(int numero, String cpf) {
    this.numero = numero;
    this.cpf = cpf;
    }
   
    public Conta() {
       super();
   }
   //GETTERS AND SETTERS
    public int getNumero() {
    return numero;
    }
    public void setNumero(int numero) {
    this.numero = numero;
    }
    public String getCpf() {
    return cpf;
    }
    public void setCpf(String cpf) {
    this.cpf = cpf;
    }
    public double getSaldo() {
    return saldo;
    }
    /*public void setSaldo(double saldo) {
    this.saldo = saldo;
    } */
    public boolean isAtivo() {
    return ativo;
    }
    public void setAtivo(boolean ativo) {
    this.ativo = ativo;
    }
    public void ativar() {
    this.ativo = true;
    System.out.println("Conta ativada");
    System.out.println("Saldo atual : "+this.saldo);
    //System.out.println("Continuar S/N: ");
   
   
    }
   
   
    //METHODS
    public void debito(double valor) {
       
        if(this.ativo != true) {
            System.out.println("Ative uma conta");
        }
        else if(valor > this.saldo || valor <= 0) {
    System.out.println("\nImpossível realizar esta ação.");
    }else {
    this.saldo -= valor;
    System.out.printf("Saldo atual : "+saldo);
    }
    }
    public void credito(double valor) {
        if(this.ativo != true) {
            System.out.println("Ative uma conta");
           
        }
       
        else if(valor <= 0) {
    System.out.println("\nImpossivel realizar esta ação.");
   
    }else {
    this.saldo += valor;
    System.out.printf("Saldo atual : "+saldo);
    }
    }
   
}