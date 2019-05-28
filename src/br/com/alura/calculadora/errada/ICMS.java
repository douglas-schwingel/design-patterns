package br.com.alura.calculadora.errada;

import br.com.alura.calculadora.Orcamento;

public class ICMS implements ImpostoAntigo {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
