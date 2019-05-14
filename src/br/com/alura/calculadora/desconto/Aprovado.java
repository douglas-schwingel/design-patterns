package br.com.alura.calculadora.desconto;

import br.com.alura.calculadora.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if(!descontoAplicado){
            orcamento.desconta(orcamento.getValor() * 0.02);
            this.descontoAplicado = true;
        } else {
            throw new RuntimeException("Desconto já aplicado!");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já aprovado! Aprovação não é necessária.");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento aprovado! Não pode ser reprovado.");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual(new Finalizado());
    }
}
