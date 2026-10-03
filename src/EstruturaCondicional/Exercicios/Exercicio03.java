package EstruturaCondicional.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int b = sc.nextInt();

        if ( a % b == 0 || b % a == 0){
            System.out.println("Os numeros são multiplos");
        } else{
            System.out.println("Os numeros não são multiplos");
        }

        sc.close();
    }
}
