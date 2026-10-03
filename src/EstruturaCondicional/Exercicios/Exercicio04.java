package EstruturaCondicional.Exercicios;

import java.util.*;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial: ");
        int horaInicial = sc.nextInt();

        System.out.println("Digite a hora final: ");
        int horaFinal = sc.nextInt();

        int horaTotal;
        if ( horaInicial < horaFinal){
            horaTotal = horaInicial - horaFinal;
        }else {
            horaTotal = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + horaTotal + " hora(s)");
        sc.close();
    }
}
