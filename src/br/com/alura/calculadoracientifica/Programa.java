package br.com.alura.calculadoracientifica;

public class Programa {

    public static void main(String[] args) {

        Expressao esquerda = new Subtracao(new Soma(new Numero(10), new Numero(15)), new Numero(3));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao soma = new Soma(esquerda, direita);

        System.out.println(soma.avalia());
    }
}
