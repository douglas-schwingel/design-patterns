package br.com.alura.calculadora.desconto;

import br.com.alura.calculadora.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos reprovados não podem receber desconto!");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento reprovado! Não pode ser aprovado.");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento reprovado não pode ser reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual(new Finalizado());
    }
}
