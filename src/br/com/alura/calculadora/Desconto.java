package br.com.alura.calculadora;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto desconto);
}
