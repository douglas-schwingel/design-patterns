package br.com.alura.calculadora.impostos;

import br.com.alura.calculadora.Orcamento;

public abstract class Imposto {
    
    private final Imposto outroImposto;

    public Imposto() {
        this.outroImposto = null;
    }

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public abstract double calcula(Orcamento orcamento);

    protected double calculoDoOutroImposto(Orcamento orcamento) {
        if (outroImposto == null) return 0;
        return outroImposto.calcula(orcamento);
    }
}
