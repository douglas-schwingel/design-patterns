package br.com.alura.calculadora.desconto;

import br.com.alura.calculadora.Orcamento;

public class DescontoPorCincoItens extends TemplateDesconto {

    @Override
    protected double valorDoDesconto(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    protected boolean condicao(Orcamento orcamento) {
        return orcamento.getItens().size() > 5;
    }

    @Override
    public void setProximo(Desconto proximo) {
        super.proximo = proximo;
    }
}
