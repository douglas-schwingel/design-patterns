package br.com.alura.calculadora;

public class Item {

    private final String nome;
    private final double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object obj) {
        obj = (Item) obj;
        return this.nome.equals(((Item) obj).getNome());
    }
}
