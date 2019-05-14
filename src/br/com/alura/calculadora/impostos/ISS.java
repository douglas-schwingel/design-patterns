package br.com.alura.calculadora.impostos;

import br.com.alura.calculadora.Orcamento;

public class ISS extends Imposto {

    public ISS() {
    }

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
    }

}
