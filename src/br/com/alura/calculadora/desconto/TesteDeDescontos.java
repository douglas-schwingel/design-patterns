package br.com.alura.calculadora.desconto;

import br.com.alura.calculadora.Item;
import br.com.alura.calculadora.Orcamento;

public class TesteDeDescontos {

    public static void main(String[] args) {
        CalculadorDeDesconto descontos = new CalculadorDeDesconto();

        Orcamento orcamento = new Orcamento(500);
        orcamento.adicionaItem(new Item("Caneta", 250));
        orcamento.adicionaItem(new Item("Lapis", 250));
        System.out.println(orcamento.temItem("Lapis"));
        System.out.println(orcamento.temItem("Caneta"));

        double descontoFinal = descontos.calcula(orcamento);

        System.out.println(descontoFinal);

    }
}
