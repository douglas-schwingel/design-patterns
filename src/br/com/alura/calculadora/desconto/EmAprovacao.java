package br.com.alura.calculadora.desconto;

import br.com.alura.calculadora.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if(!descontoAplicado) {
            orcamento.desconta(orcamento.getValor() * 0.05);
            descontoAplicado = true;
        } else {
            throw new RuntimeException("Desconto já aplicado!");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.estadoAtual(new Aprovado());
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.estadoAtual(new Reprovado());
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamento em aprovação não pode ser finalizado. Primeiro, aprove ou reprove. Depois" +
                "tente novamente.");
    }
}
