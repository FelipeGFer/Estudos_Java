package Estruturasequencial.ProcessamentoDeDados;

public class ProcessamentoDeDados {
    public static void main (String[] args){

        // = le-se recebe

        int x = 5;
        double z;

        z = 2 * x;

        System.out.println(x);
        System.out.println(z);

        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2 * h;

        System.out.println(area);

        int a,c;
        double result;

        a = 5;
        c = 2;

        // Casting é a conversão explicita dfos valores
        // Colocando (double) antes da expressão voce fala para o interpretador que não é para truncar o valor, imprimindo o resultado correto
        result = (double) a/c;

        System.out.println(result);

        int t;
        double f;

        f = 5.0;
        //outro exemplo utilizando casting, utilizando o (int) para poder atribuir o valor da varial double em uma int
        t = (int) f;

        System.out.println(t);


    }
}
