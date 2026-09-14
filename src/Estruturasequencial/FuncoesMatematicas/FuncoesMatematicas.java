package Estruturasequencial.FuncoesMatematicas;

public class FuncoesMatematicas {
    public static void main (String[] args){

        // A = Math.sqrt(x); Variavel A recebe a raiz quadrada de x
        // A = Math.pow(X, y); Variavel A recebe o resultado de x elevado a y
        // A = Math.abs(x); Varivael A recebe o valor absoluto de x (Retirar o negativo cao exista)

        double x = 9.0;
        double y = 4.0;
        double z = -5.0;

        double A, B, C, delta, x1, x2;

        B = Math.sqrt(y);
        C = Math.sqrt(25);
        System.out.println("Raiz quadrada de " + x  + " = " + Math.sqrt(x));
        System.out.println("Raiz quadrada de " + y  + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        System.out.println(x + " elvado a " + y + " é igual a " + A);
        System.out.println(x + " elevado ao quadrado é igual a " + Math.pow(x, 2.0));
        System.out.println("5 elevado ao quadrado é igual a " + Math.pow(5, 2.0));

        System.out.println("Valor absoluto de " + x + " é igual a " + Math.abs(x));
        System.out.println("Valor absoluto de " + z + " é igual a " + Math.abs(z));

        delta  = Math.pow(y, 2.0) - 4 * x * z;
        System.out.println(delta);
        x1 = (-y + Math.sqrt(delta)) / (2 * x);
        x2 = (-y - Math.sqrt(delta)) / (2 * x);

        System.out.println(x1);
        System.out.println(x2);
    }
}
