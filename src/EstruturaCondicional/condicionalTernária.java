package EstruturaCondicional;

import java.util.Scanner;

public class condicionalTernária {
    public static void main ( String[] args) {

// SINTAXE:
//     (condição)? Valor se verdadeiro : valor se falso
        Scanner sc = new Scanner(System.in);

       String mensagem = (2 > 5) ? "Boa noite" : "Bom dia";

        System.out.println(mensagem);

        System.out.println("Informe o preço do produto: ");
        double preco = sc.nextDouble();

        double desconto = (preco >= 100) ? preco * 0.35 : preco * 0.15;

        System.out.printf("Deconto de: %.2f", desconto);

        sc.close();
    }
}
