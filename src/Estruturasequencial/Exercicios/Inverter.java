package Estruturasequencial.Exercicios;

public class Inverter {
    public static void main(String[] args){

        int a = 1, b = 23;
        int temp;

        System.out.println("a igual a: " + a + "\n"+ "b igual a: " + b);

        System.out.println("invertendo...");
        temp = a;
        a=b;
        b=temp;

        System.out.println("a igual a: " + a + "\n"+ "b igual a: " + b);

        System.out.println("Outra forma: ");
        a = 2;
        b = 6;
        System.out.println("a igual a: " + a + "\n"+ "b igual a: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a igual a: " + a + "\n"+ "b igual a: " + b);
    }
}
