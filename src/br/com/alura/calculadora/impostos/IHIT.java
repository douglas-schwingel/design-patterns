package br.com.alura.calculadora.impostos;

import br.com.alura.calculadora.Orcamento;

public class IHIT extends TemplateImpostoCondicional {

    public IHIT() {
    }

    public IHIT(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return (orcamento.getValor() * 0.01) * orcamento.getItens().size();
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return (orcamento.getValor() * 0.13) + 100;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
            return orcamento.temItemRepetido();
    }
}
