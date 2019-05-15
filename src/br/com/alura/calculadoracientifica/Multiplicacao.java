package br.com.alura.calculadoracientifica;

public class Multiplicacao implements Expressao {

    private final Expressao esquerda;
    private final Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }


    @Override
    public int avalia() {
        int valorDaEsquerda = esquerda.avalia();
        int valorDaDireita = direita.avalia();
        return valorDaEsquerda * valorDaDireita;
    }
}
