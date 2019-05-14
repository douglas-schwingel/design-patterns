package br.com.alura.calculadora;

public class ItemDaNota {

    private String nome;
    private double valor;

    public ItemDaNota(String nome, double valor) {
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
    public String toString() {
        return "Nome: " + this.nome + " | Valor: R$" + this.valor;
    }
}
