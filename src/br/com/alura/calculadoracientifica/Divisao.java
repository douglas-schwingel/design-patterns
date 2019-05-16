package br.com.alura.calculadoracientifica;

public class Divisao implements Expressao {

    private final Expressao esquerda;
    private final Expressao direita;

    public Divisao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }


    @Override
    public int avalia() {
        int valorDaEsquerda = esquerda.avalia();
        int valorDaDireita = direita.avalia();
        if (valorDaDireita == 0) throw new RuntimeException("Não pode divir por zero!");
        return valorDaEsquerda / valorDaDireita;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaDivisao(this);
    }

    public Expressao getEsquerda() {
        return this.esquerda;
    }

    public Expressao getDireita() {
        return this.direita;
    }
}
