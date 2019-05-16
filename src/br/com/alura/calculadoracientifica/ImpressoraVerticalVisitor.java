package br.com.alura.calculadoracientifica;

import java.util.Arrays;

public class ImpressoraVerticalVisitor implements Visitor {
    @Override
    public void visitaSoma(Soma soma) {
        soma.getEsquerda().aceita(this);
        System.out.print("\n+");
        soma.getDireita().aceita(this);
        desenhaLinha(soma);
    }

    @Override
    public void visitaSubstracao(Subtracao subtracao) {
        subtracao.getEsquerda().aceita(this);
        System.out.print("\n-");
        subtracao.getDireita().aceita(this);
        desenhaLinha(subtracao);
    }

    @Override
    public void visitaDivisao(Divisao divisao) {
        divisao.getEsquerda().aceita(this);
        desenhaLinha(divisao);
        divisao.getDireita().aceita(this);
        desenhaLinha(divisao);
    }

    @Override
    public void visitaNumero(Numero numero) {
        System.out.print(numero.getNumero());
    }

    @Override
    public void visitaMultiplicacao(Multiplicacao multiplicacao) {
        multiplicacao.getEsquerda().aceita(this);
        System.out.print("\n-");
        multiplicacao.getDireita().aceita(this);
        desenhaLinha(multiplicacao);
    }

    @Override
    public void visitaRaizQuadrada(RaizQuadrada raizQuadrada) {
        System.out.print("\u221A");
        raizQuadrada.getExpressao().aceita(this);
    }

    private void desenhaLinha(Expressao expressao) {
        System.out.println();
        for (int i = 0; i < getIndex(expressao); i++) {
            System.out.print("_");
        }
        System.out.print("\n");
    }

    private int getIndex(Expressao expressao) {
        String se = String.valueOf(expressao.getEsquerda().avalia());
        String s = String.valueOf(expressao.getDireita().avalia());
        return (s.length() > se.length()) ? s.length() : se.length();
    }
}
