package br.com.alura.calculadora.desconto;

import br.com.alura.calculadora.Orcamento;

public abstract class TemplateDesconto {

    Desconto proximo;

    public double desconta(Orcamento orcamento) {
        if(condicao(orcamento)) return valorDoDesconto(orcamento);
        else return proximo.desconta(orcamento);
    }

    protected abstract double valorDoDesconto(Orcamento orcamento);

    protected abstract boolean condicao(Orcamento orcamento);

    public abstract void setProximo(Desconto proximo);
}
