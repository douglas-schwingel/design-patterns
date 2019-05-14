package br.com.alura.banco;

public class Conta {

    private double saldo;
    private String nome;

    public Conta(String nome) {
        this.nome = nome;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNome() {
        return nome;
    }
}