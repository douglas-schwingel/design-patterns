package br.com.alura.calculadora.impostos;

import br.com.alura.calculadora.Orcamento;
import br.com.alura.calculadora.impostos.Imposto;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        double valor = imposto.calcula(orcamento);
        System.out.println(valor);
    }
}
