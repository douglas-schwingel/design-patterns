package br.com.alura.calculadora.desconto;

import br.com.alura.calculadora.Orcamento;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto desconto);
}
