package EstruturaCondicional;

import java.util.Scanner;

public class estruturaCondicinal {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 5;

//       System.out.println("Bom dia!");
//        if (x < 0) {
//            System.out.println("Boa tarde!");
//        }
//        System.out.println("Boa noite!");

        int hora;
        System.out.println("Quantas horas? ");
        hora = sc.nextInt();

        if (hora < 12 ) {
            System.out.println("Bom dia!");
        }
        else if (hora <= 18) {
            System.out.println("Boa tarde!");
        }
        else{
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}
