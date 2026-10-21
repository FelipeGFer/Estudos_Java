package EstruturaCondicional.SwitchCase;

import java.text.Normalizer;
import java.util.*;

public class SwitchCase {
   public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
       /*
       Quando se tem varis opções de fluxo a serem tratadas com base no valor de uma variavel, ao inves de se utiliozar
       varios if-else encadeados, pode-se optar por usare Switch Case
       */

    /* Opção que ja imprime na tela com selecionada a opção
       System.out.println("Digite um numero de 1 a 7");
       int dia = sc.nextInt();

        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        */

//  Nesta opção o valor é armazenado em uma variavel e pode ser utilizado em outros casos
//       System.out.println("Digite um numero de 1 a 7");
//       int num = sc.nextInt();
       String dia;

//       switch (num){
//           case 1:
//               dia = "Domingo";
//               break;
//           case 2:
//               dia = "Segunda";
//               break;
//           case 3:
//               dia = "Terça";
//               break;
//           case 4:
//               dia = "Quarta";
//               break;
//           case 5: // valor padrao para caso nem uma op;'ao seja valida
//               dia = "Quinta";
//               break;
//           case 6:
//               dia = "Sexta";
//               break;
//           case 7:
//               dia = "Sabado";
//               break;
//           default:
//               dia = "Opção invalida";
//               break;
//       }

       System.out.println("Digite um dia da semana");
       dia = sc.nextLine().strip().toLowerCase();

       if (!dia.isEmpty()) {
         // Normalização da entrada
         String normalizada = Normalizer.normalize(dia, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]","");
         String primeiraLetra = normalizada.substring(0,1).toUpperCase();
         String restante = normalizada.substring(1);
         dia = primeiraLetra + restante;


           System.out.println(dia);
           switch (dia){
               case "Sabado":
                   System.out.println("Sabadou");
                   break;
               case "Sexta":
                   System.out.println("Sextou");
                   break;
               case "Domingo":
                   System.out.println("Domingo a Noite :(");
                   break;
               default:
                   if(dia.equals("Segunda") || dia.equals("Terça") || dia.equals("Quarta") || dia.equals("Quinta")) {
                       System.out.println("Dia de semana");
                   }else {
                       System.out.println(dia + " Não é valido");
                   }
                   break;
           }
       }else {
           System.out.println("Valor vaizio");
       }

//       System.out.println(dia);
       sc.close();
   }
}
