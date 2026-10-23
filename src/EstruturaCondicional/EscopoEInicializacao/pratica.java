package EstruturaCondicional.EscopoEInicializacao;

public class pratica {
    public static void main ( String[] args) {
      // a variavel não foi inicializada, então qualquer oarte que for tuliziar ela dará erro
//        int num;
//        System.out.println(num);

//        int num = 23;
//        if (num < 100){
//            double div = num / 2;
//        }
// deu erro pois a variavel "div" eta fora do metodo, ela foi declarada e utilizada apenas dentro da estrutura condicinal if.
//        Qual quer estrutura de controle tem seu proprio escopo, toda variacvel declarada dentro da estrutura só existe dentro dela, e quado sair a variavel sera removida da memoria
//        System.out.println(div);


        int num = 23;
        double div = 0;
        if (num < 100){
            div = num / 2;
        }
// Ainda permanesse o erro pois mesmo declarada, se a condi;'ao for falsa a variavel n'ao será inicializada. Pòr isso se inicia ela antes com algum valor
        System.out.println(div);





    }

}
