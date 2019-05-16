package br.com.alura.calculadoracientifica;

public class TesteVisitorVertical {

    private static ImpressoraVerticalVisitor impressora;

    public static void main(String[] args) {
        impressora = new ImpressoraVerticalVisitor();

        calculaEImprime(new Soma(new Numero(5), new Numero(100)));
        calculaEImprime(new Subtracao(new Numero(12), new Numero(6)));
        Expressao soma = new Soma(new Numero(12), new Numero(8));
        calculaEImprime(new Subtracao(soma, new Numero(6)));
    }

    private static void calculaEImprime(Expressao tipoOperacao) {
        System.out.println("\n*************************");
        tipoOperacao.aceita(impressora);
        System.out.println(tipoOperacao.avalia());
    }
}
