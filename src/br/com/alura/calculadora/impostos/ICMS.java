package br.com.alura.calculadora.impostos;

import br.com.alura.calculadora.Orcamento;

public class ICMS implements Imposto {
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
