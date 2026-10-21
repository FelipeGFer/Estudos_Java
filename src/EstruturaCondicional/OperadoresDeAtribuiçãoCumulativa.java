package EstruturaCondicional;

import java.util.Scanner;

public class OperadoresDeAtribuiçãoCumulativa {
/*
    Operadores de atribuição cumulativa
        a += b;    =>  a = a + b;
        a -= b;    =>  a = a - b;
        a *= b;    =>  a = a * b;
        a /= b;    =>  a = a / b;
        a %= b;    =>  a = a % b;
 */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int minutos = 103;

        double totalPagar = 50;

        if(minutos > 100){
            totalPagar += (minutos - 100) * 2;
        }

        System.out.printf("Total a pargar sera de: %.2f%n", totalPagar);

        sc.close();
    }

}
