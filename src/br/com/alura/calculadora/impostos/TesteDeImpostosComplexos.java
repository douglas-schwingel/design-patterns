package br.com.alura.calculadora.impostos;

import br.com.alura.calculadora.Orcamento;

public class TesteDeImpostosComplexos {

    public static void main(String[] args) {
        Imposto iss = new ISS(new ISS());
        Orcamento orcamento = new Orcamento(500);

        double valor = iss.calcula(orcamento);
        System.out.println(valor);
    }
}
