package br.com.alura.calculadoracientifica;

public class Programa {

    public static void main(String[] args) {

        Expressao esquerda = new Subtracao(new Soma(new Numero(10), new Numero(15)), new Numero(3));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao soma = new Soma(esquerda, direita);

        System.out.println(soma.avalia());
        System.out.println("*************************");

        Expressao divisao = new Divisao(new Numero(8), new Soma(new Numero(2), new Numero(2)));
        System.out.println(divisao.avalia());
        System.out.println("*************************");
        System.out.println(new Multiplicacao(new Numero(5), new Numero(25)).avalia());
        System.out.println("*************************");
        Expressao raizQuadrada = new RaizQuadrada(new Soma(new Numero(2), new Numero(2)));
        System.out.println(raizQuadrada.avalia());

    }
}
