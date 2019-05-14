package br.com.alura.calculadora.desconto;

import br.com.alura.calculadora.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já finalizado! Desconto não aplicável");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já finalizado! Não pode ser aprovado.");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já finalizado! Não pode ser reprovado.");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já finalizado! Não pode ser finalizado novamente.");
    }
}
