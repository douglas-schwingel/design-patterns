package br.com.alura.calculadora.impostos;

import br.com.alura.calculadora.Item;
import br.com.alura.calculadora.Orcamento;

public class IKCV extends TemplateImpostoCondicional {

    public IKCV() {
    }

    public IKCV(Imposto outroImposto) {
        super(outroImposto);
    }

    private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getValor() > 100) return true;
        }
        return false;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor()> 500 && temItemMaiorQue100Reais(orcamento);
    }
}
