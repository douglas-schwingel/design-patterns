package br.com.alura.calculadora;

import br.com.alura.calculadora.desconto.EmAprovacao;
import br.com.alura.calculadora.desconto.EstadoDeUmOrcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private double valor;
    private final List<Item> itens;
    private EstadoDeUmOrcamento estadoAtual;

    public Orcamento(double valor) {
        this.valor = valor;
        itens = new ArrayList<Item>();
        this.estadoAtual = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public boolean temItem(String nomeItem) {
        for (Item item : itens) {
            if(item.getNome().contains(nomeItem)) return true;
        }
        return false;
    }

    public void desconta(double valor) {
        this.valor -= valor;
    }

    public boolean temItemRepetido() {
        for (Item item : itens) {
            int quantidade = 0;
            for (int i = 0; i < this.itens.size(); i++) {
                if(verificaSeSaoIguais(item, i)) quantidade++;
            }
            return quantidade >= 2;
        }
        return false;
    }

    private boolean verificaSeSaoIguais(Item item, int i) {
        return item.equals(this.itens.get(i));
    }

    public void estadoAtual(EstadoDeUmOrcamento novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
        estadoAtual.aprova(this);
    }

    public void reprova() {
        estadoAtual.reprova(this);
    }

    public void finaliza() {
        estadoAtual.finaliza(this);
    }
}
