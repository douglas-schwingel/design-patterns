package br.com.alura.calculadora.errada;

import br.com.alura.calculadora.Orcamento;

public class ISS implements ImpostoAntigo{

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
