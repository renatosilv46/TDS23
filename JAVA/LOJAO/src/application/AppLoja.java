
package application;



import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;



public class AppLoja {



   public static void main(String[] args) {

       

       Locale.setDefault(Locale.US);

       Scanner leia = new Scanner(System.in);

       

       List<Produto> cadastro = new ArrayList<>();

       List<Produto> carrinho = new ArrayList<>();

       char op;

       String auxCod;

       int i=0;

       int auxQtde=0;

       double auxSub=0.00;

       char pag;

       

       cadastro.add(new Produto("COD01","BONÉ ",100.00,10));

       cadastro.add(new Produto("COD02","CALÇA ",150.00,10));

       cadastro.add(new Produto("COD03","BERMUDA AFRO",90.00,10));

       

       

       do {

           

           

           System.out.println("COD\tPRODUTO\t\tVALOR(R$)\tESTOQUE");

           for(Produto e : cadastro) {

               System.out.println(e);

           }

           auxSub=0.00;

           System.out.println("--------CARRINHO DE COMPRAS ----------");

           System.out.println("COD\tPRODUTO\t\tVALOR(R$)\tQTDE\tSUB-TOTAL");

           for(Produto e : carrinho) {

               

               System.out.print(e);

               System.out.println("\t"+(e.getValor()*e.getEstoque()));

               auxSub += (e.getValor()*e.getEstoque());

           }

           System.out.println("Sub-total : R$ "+auxSub);

           System.out.print("\nDigite o codigo do produto que deseja compra : ");

           auxCod = leia.next().toUpperCase();

           i = 0;

           for(Produto e : cadastro) {

               if(e.getCodigo().equals(auxCod)) {

                   break;

               }

               i++;

           }

           if(cadastro.size() == i) {

               System.out.println("Codigo não encontrado...");

           }

           else {

               System.out.println(cadastro.get(i).getCodigo() + " - "+cadastro.get(i).getNome());

               System.out.print("Qual a quantidade : ");

               auxQtde = leia.nextInt();

               carrinho.add(new Produto(cadastro.get(i).getCodigo(),

                               cadastro.get(i).getNome(),

                               cadastro.get(i).getValor(),

                               auxQtde));

               

           }

           

           System.out.println("Fecha a compra S/N: ");

           op = leia.next().toUpperCase().charAt(0);

           auxSub=0.00;

           System.out.println("--------CARRINHO DE COMPRAS FINAL---------");

           System.out.println("COD\tPRODUTO\t\tVALOR(R$)\tQTDE\tSUB-TOTAL");

           for(Produto e : carrinho) {

               

               System.out.print(e);

               System.out.println("\t"+(e.getValor()*e.getEstoque()));

               auxSub += (e.getValor()*e.getEstoque());

           }

           System.out.println("Sub-total : R$ "+auxSub);

           

           if(op=='S') {

               

               System.out.println("Valor da COMPRA R$ "+auxSub);

               System.out.println("Imposto 9% "+(auxSub*0.09));

               System.out.print("\n1 - A VISTA(-10%)\t2-CARTÃO(+10%)\t3-CARTÃO 2 VEZES(+15%) :");

               pag = leia.next().charAt(0);

               if(pag=='1') {

                   System.out.println("---- NOTA FISCAL ----");

                   System.out.println("Valor Total R$ "+auxSub);

                   System.out.println("Imposto 9% R$ "+(auxSub*0.09));

                   System.out.println("Desconto 10% R$ "+(auxSub*0.10));

                   System.out.println("Total a pagar R$ "+(auxSub-(auxSub*0.10)));

               }

               i=0;

               for(Produto e : cadastro) {

                   for(Produto y : carrinho) {

                       if(e.getCodigo().equals(y.getCodigo())) {

                           e.tirarEstoque(y.getEstoque());

                       }

                   }

               }

               carrinho.clear();

               

           }



           //SAIDA - ESCAPE

           System.out.print("Compras S-sim ou N-não : ");

           op = leia.next().toUpperCase().charAt(0);

           

       } while(op!='N');

       System.out.println("Obrigado até breve");

       

       



   }

   

   



}