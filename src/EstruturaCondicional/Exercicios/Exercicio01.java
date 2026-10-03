package EstruturaCondicional.Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero < 0){
            System.out.println("Numero negativo");
        } else {
            System.out.println("Numero positivo");
        }


    }
}
