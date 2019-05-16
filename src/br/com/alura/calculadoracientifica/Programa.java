package br.com.alura.calculadoracientifica;

public class Programa {

    private static Visitor impressora;

    public static void main(String[] args) {
        impressora = new ImpressoraVisitor();
        Expressao esquerda = new Subtracao(new Soma(new Numero(10), new Numero(15)), new Numero(3));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao soma = new Soma(esquerda, direita);

        calculaEImprime(soma);
        calculaEImprime(new Divisao(new Numero(8), new Soma(new Numero(2), new Numero(2))));
        calculaEImprime(new Multiplicacao(new Numero(5), new Numero(25)));
        calculaEImprime(new RaizQuadrada(new Soma(new Numero(2), new Numero(2))));
    }

    private static void calculaEImprime(Expressao tipoOperacao) {
        System.out.println("\n*************************");
        tipoOperacao.aceita(impressora);
        System.out.print(" = ");
        System.out.println(tipoOperacao.avalia());
    }
}
