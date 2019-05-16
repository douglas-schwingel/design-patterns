package br.com.alura.calculadoracientifica;

public class Numero implements Expressao {

    private int num;

    public Numero(int num) {
        this.num = num;
    }

    @Override
    public int avalia() {
        return this.num;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaNumero(this);
    }

    @Override
    public Expressao getEsquerda() {
        return null;
    }

    @Override
    public Expressao getDireita() {
        return null;
    }

    public int getNumero() {
        return this.num;
    }
}
