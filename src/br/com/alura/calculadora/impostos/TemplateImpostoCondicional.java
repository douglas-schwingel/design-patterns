package br.com.alura.calculadora.impostos;

import br.com.alura.calculadora.Orcamento;
import br.com.alura.calculadora.impostos.Imposto;

public abstract class TemplateImpostoCondicional implements Imposto {
    @Override
    public double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)) return maximaTaxacao(orcamento);
        else return minimaTaxacao(orcamento);
    }

    protected abstract double minimaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
        
}
