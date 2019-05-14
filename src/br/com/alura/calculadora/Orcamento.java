package br.com.alura.calculadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private final double valor;
    private final List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        itens = new ArrayList<Item>();
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
}
