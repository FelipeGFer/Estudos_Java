package Estruturasequencial.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        double tempoTrabalho = 200;
        double valorHora =20.50;


        System.out.println("digite o numeor do funcionariko: ");
        int funcionario = sc.nextInt();

        double salario = valorHora * tempoTrabalho;

        double horas = tempoTrabalho/60;

        System.out.println(funcionario);
        System.out.printf("%.2f%n", salario);
        System.out.printf("%.2f%n", horas);



        sc.close();
    }
}
