package br.com.alura.calculadora;

public class CalculadorDeDesconto {

    public double calcula(Orcamento orcamento) {
        if(orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        } else if(orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;

        }

        return 0;
    }
}
