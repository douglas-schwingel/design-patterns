package br.com.alura.calculadora.errada;

import br.com.alura.calculadora.Orcamento;

public class CalculadoraAntiga {

    public void realizaCalculo(Orcamento orcamento, ImpostoAntigo imposto) {
        System.out.println(imposto.calcula(orcamento));
    }

}
