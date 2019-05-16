package br.com.alura.calculadoracientifica;

import br.com.alura.calculadora.Impressora;

public class Programa {

    public static void main(String[] args) {
        ImpressoraVisitor impressora = new ImpressoraVisitor();
        ImpressoraPreFixaVisitor preFixa = new ImpressoraPreFixaVisitor();
        Expressao esquerda = new Subtracao(new Soma(new Numero(10), new Numero(15)), new Numero(3));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao soma = new Soma(esquerda, direita);

        calculaEImprime(impressora, soma);
        calculaEImprime(preFixa, soma);
        calculaEImprime(impressora, new Divisao(new Numero(8), new Soma(new Numero(2), new Numero(2))));
        calculaEImprime(preFixa, new Divisao(new Numero(8), new Soma(new Numero(2), new Numero(2))));
        calculaEImprime(impressora, new Multiplicacao(new Numero(5), new Numero(25)));
        calculaEImprime(preFixa, new Multiplicacao(new Numero(5), new Numero(25)));
        calculaEImprime(impressora, new RaizQuadrada(new Soma(new Numero(2), new Numero(2))));
        calculaEImprime(preFixa, new RaizQuadrada(new Soma(new Numero(2), new Numero(2))));
    }

    private static void calculaEImprime(Visitor impressora, Expressao tipoOperacao) {
        System.out.println("\n*************************");
        tipoOperacao.aceita(impressora);
        System.out.print(" = ");
        System.out.println(tipoOperacao.avalia());
    }
}
