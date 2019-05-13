package br.com.alura.calculadora;

public class CalculadorDeDesconto {

    public double calcula(Orcamento orcamento) {
        Desconto desconto5Itens = new DescontoPorCincoItens();
        Desconto desconto500Reais = new DescontoPorMaisDeQuinhentosReais();
        Desconto semDesconto = new SemDesconto();

        desconto5Itens.setProximo(desconto500Reais);
        desconto500Reais.setProximo(semDesconto);

        return desconto5Itens.desconta(orcamento);
    }
}
