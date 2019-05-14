package br.com.alura.calculadora.desconto;

import br.com.alura.calculadora.Orcamento;

public interface EstadoDeUmOrcamento {
    void aplicaDescontoExtra(Orcamento orcamento);
    void aprova(Orcamento orcamento);
    void reprova(Orcamento orcamento);
    void finaliza(Orcamento orcamento);
}
