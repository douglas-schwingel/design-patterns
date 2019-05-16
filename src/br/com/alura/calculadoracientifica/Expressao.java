package br.com.alura.calculadoracientifica;

public interface Expressao {

    int avalia();
    void aceita(Visitor visitor);

    Expressao getEsquerda();
    Expressao getDireita();
}
