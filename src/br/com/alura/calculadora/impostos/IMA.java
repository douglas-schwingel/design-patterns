package br.com.alura.calculadora.impostos;

import br.com.alura.calculadora.Orcamento;

public class IMA extends Imposto {

    public IMA() {
    }

    public IMA(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
    }
}
