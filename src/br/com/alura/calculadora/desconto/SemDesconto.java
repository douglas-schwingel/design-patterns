package br.com.alura.calculadora.desconto;

import br.com.alura.calculadora.Orcamento;

public class SemDesconto implements Desconto {
    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto desconto) {
//        nao tem
    }
}
