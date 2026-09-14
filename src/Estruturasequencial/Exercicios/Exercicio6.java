package Estruturasequencial.Exercicios;

public class Exercicio6 {
    public static void main(String[] args){

        Double A, B, C;
        A = 3.0;
        B = 4.0;
        C = 5.2;

        System.out.printf("Area do triangulo retangulo: %.2f%n", (A*C)/2);
        System.out.printf("Area do circulo: %.2f%n", 3.14159 * Math.pow(C,2));
        System.out.printf("Area do trapezio: %.2f%n", ((A+B)*C)/2);
        System.out.printf("Area do quadrado: %.2f%n", Math.pow(B,2));
        System.out.printf("Area do retangulo: %.2f%n", A*B);
    }
}
