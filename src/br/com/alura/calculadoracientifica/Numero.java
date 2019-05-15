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
}
