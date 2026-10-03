package EstruturaCondicional.Exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=======MENU+++++++");
        System.out.println("Codigo         Especificação        preço");
        System.out.println();
        System.out.println("1              Cachorro quente      R$4,00");
        System.out.println("2              X-Salada             R$4,50");
        System.out.println("3              X-Bacon              R$5,00");
        System.out.println("4              Torrada simples      R$2,00");
        System.out.println("5              Refrigerante         R$1,50");
        System.out.println();

        System.out.println("Digite o codigo do prato desejado: ");
        int codigo = sc.nextInt();

        System.out.println("Digite a quantidade desejada: ");
        double quantidade = sc.nextDouble();

        double total;
        if (codigo == 1){
            total = quantidade * 4.00;
        } else if (codigo == 2){
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        }   else if (codigo == 4) {
            total = quantidade * 2.00;
        }else{
            total = quantidade * 1.50;
        }
        System.out.printf("Total: R$%.2f", total);

        sc.close();
    }


}
