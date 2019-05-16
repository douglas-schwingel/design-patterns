package br.com.alura.calculadoracientifica;

public class RaizQuadrada implements Expressao {

    private final Expressao expressao;

    public RaizQuadrada(Expressao expressao) {
        this.expressao = expressao;
    }


    @Override
    public int avalia() {
        double valorDaExpressao = expressao.avalia();
        double sqrt = Math.sqrt(valorDaExpressao);
        int sqrtInt = (int)Math.round(sqrt);
        return sqrtInt;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaRaizQuadrada(this);
    }

    @Override
    public Expressao getEsquerda() {
        return null;
    }

    @Override
    public Expressao getDireita() {
        return null;
    }

    public Expressao getExpressao() {
        return expressao;
    }
}
