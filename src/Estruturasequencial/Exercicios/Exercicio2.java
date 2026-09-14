package Estruturasequencial.Exercicios;

import java.util.Scanner;
// //Calculo da area de um triangulo
public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Infome o raio do ciruclo: ");
        double raio = sc.nextDouble();

        System.out.printf("A area do circulo é iagual a: %.4f", pi * (Math.pow(raio, 2)));

        sc.close();
    }
}
