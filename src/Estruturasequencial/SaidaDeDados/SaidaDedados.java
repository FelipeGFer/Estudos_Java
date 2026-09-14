package Estruturasequencial.SaidaDeDados;

import java.util.Locale;

public class SaidaDedados {
    public static void main(String[] args) {
        int y = 32;
        double x = 14.39212;

        System.out.println(y);
        //prinft é para imprimir variaveis formatadas, nesse caso controlar o numero de casas decimais
        //%.2f é o padrao da lnguagem para delimitar casas decimais
        // %n tambem serve como quebra de linha no printft
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.5f%n", x);

        // Printf por padrao pega o formato da linguagem que o computador esta, no caso pt-RB
        //locale.Us faz considerar o separador dos USA, reconfigurando a localização do programa
        Locale.setDefault(Locale.US);
        System.out.printf("%.5f%n", x);

        //println tem um qebra de linhas no final
        System.out.println("Com quebra");

        //apenas print, não tem uma quebra de linha no final
        System.out.print("Sem quebra");
        System.out.print("Sem quebra");
        System.out.println("\n");

        double numero = 10.20;
        // para imprimir varias elementos com println
        System.out.println("Voce digitou: " + numero + " metros.");

        // para imprimir varias elementos com printf
        System.out.printf("Voce digitou: %.2f metros%n", numero);

        // Para concatenar varios elementos em um print é feito da seguinte forma
        // %f ponto flutuante, %d inteiro, %s texto, %n quebra de linhas
        String nome = "Evertom";
        int idade = 23;
        double renda = 5060.23;

        System.out.printf("Seu nome é %s e tem %d anos com uma renda de R$%.2f ao mes%n", nome, idade, renda);
        System.out.println("seu nome é " + nome + "e tem "+ idade + " anos, com uma reda de R$" + renda + " ao mes");
    }
}
