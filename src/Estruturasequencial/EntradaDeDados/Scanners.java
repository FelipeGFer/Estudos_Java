package Estruturasequencial.EntradaDeDados;

import java.util.*;

public class Scanners {

    public static void main (String[] args){
    // //para ler entradas de dados pelo terminal da aplicação é criado um objeto do tipo Scanner
    // Sempre será necessario importar a classe Sacnner: import: java.util.Scammer;
    // sempre fazer sc.close(); quando não for mais utilizaar o objeto sc, irá desalocar este recurso

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    //Para ler uma poalavra (Texto sem espaço)
    // para String usamos X = (recebendo) sc.next(); mas desta forma ele le apenas a palavra ate o primeiro espaço
    // para ler uma string inteira usamos x = sc.nextLine(); existe uma pegadinha aqui, pq sempre quando for feito uma declaração de outro next antes no nextLine()
    // e for precionado o "ENTERN" o nextLine ira consumir esse "ENTER" , pq o enter ficar no buffer
    // para int usamos  x = sc.nexetInt();
    // para double usmos x = sc.nextDouble(); (ele ira pegar o separador do sistema) usar locale para corrigir para ponto, declarando ante da declaração do Scanner
    // para char usamos x = sc.next().charAt(0); Chamos .charAt(0) para pegar o primeiro caracter de uma String. é possivel trocar o 0 para a posição da letra que voce quer pegar
    // para boolean usamos x = sc.nextBoolean();

    /*    String x;
        int y;
        double z;

         x = sc.next();
         y = sc.nextInt();
         z = sc.nextDouble();

        System.out.println("Digitou: " + x);
        System.out.println("Digitou: " + y);
        System.out.println("Digitou: " + z);
    */
    //    System.out.printf("Double: %.2f%n", x);
        int x;
        String s1, s2 ,s3;
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados que voce digitou: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }

}
