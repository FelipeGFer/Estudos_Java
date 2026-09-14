package Estruturasequencial.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o codigo da peça: ");
        int peca1 = sc.nextInt();

        System.out.println("Infome a qualtidade selocionada de peças " + peca1);
        int quantidade1 = sc.nextInt();

        System.out.println("informe o valor da peça " + peca1);
        double valorPeca1 = sc.nextDouble();

        // entrada peça 2
        System.out.println("Informe o codigo da peça: ");
        int peca2 = sc.nextInt();

        System.out.println("Infome a qualtidade selocionada de peças " + peca2);
        int quantidade2 = sc.nextInt();

        System.out.println("informe o valor da peça " + peca2);
        double valorPeca2 = sc.nextDouble();

        System.out.println("Peça: " + peca1);
        System.out.printf("Valor a pagar: R$ %.2f%n", quantidade1 * valorPeca1 );
        System.out.println("Peça: " + peca2);
        System.out.printf("Valor a pagar: R$ %.2f%n", quantidade2 * valorPeca2 );

        System.out.printf("Total a pargar: R$ %.2f", (quantidade1 * valorPeca1 + quantidade2 * valorPeca2));
    }
}
