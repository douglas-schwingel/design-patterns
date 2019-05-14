package br.com.alura.calculadora;

public class TesteDeDescontos {

    public static void main(String[] args) {
        CalculadorDeDesconto descontos = new CalculadorDeDesconto();

        Orcamento orcamento = new Orcamento(600);
        orcamento.adicionaItem(new Item("Caneta", 350));
        orcamento.adicionaItem(new Item("Lapis", 250));

        double descontoFinal = descontos.calcula(orcamento);

        System.out.println(descontoFinal);

    }
}
