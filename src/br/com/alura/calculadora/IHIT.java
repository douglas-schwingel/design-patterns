package br.com.alura.calculadora;

public class IHIT extends TemplateImpostoCondicional {

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
