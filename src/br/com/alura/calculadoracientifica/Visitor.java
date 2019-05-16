package br.com.alura.calculadoracientifica;

public interface Visitor {
    void visitaSoma(Soma soma);

    void visitaSubstracao(Subtracao subtracao);

    void visitaDivisao(Divisao divisao);

    void visitaNumero(Numero numero);

    void visitaMultiplicacao(Multiplicacao multiplicacao);

    void visitaRaizQuadrada(RaizQuadrada raizQuadrada);
}
