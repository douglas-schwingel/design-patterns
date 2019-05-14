package br.com.alura.calculadora.impostos;

import br.com.alura.calculadora.Orcamento;

public abstract class TemplateImpostoCondicional extends Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)) return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
        else return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
    }

    protected abstract double minimaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
        
}
