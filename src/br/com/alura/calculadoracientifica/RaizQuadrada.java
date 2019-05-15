package br.com.alura.calculadoracientifica;

public class RaizQuadrada implements Expressao {

    private final Expressao expressao;

    public RaizQuadrada(Expressao expressao) {
        this.expressao = expressao;
    }


    @Override
    public int avalia() {
        double valorDaExpressao = expressao.avalia();
        int sqrt = (int)Math.sqrt(valorDaExpressao);
        return sqrt;
    }
}
