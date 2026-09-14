package Estruturasequencial.Exercicios;

import java.util.Scanner;
// // Soma de dois valores
public class Exercicio1 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int a = sc.nextInt();

        System.out.print("Digite um valor: ");
        int b = sc.nextInt();

        System.out.println("A soma dos valores é igual a " + (a+b));

        sc.close();
    }
}
