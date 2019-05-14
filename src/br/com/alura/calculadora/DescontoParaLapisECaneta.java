package br.com.alura.calculadora;

public class DescontoParaLapisECaneta implements Desconto {

    @Override
    public double desconta(Orcamento orcamento) {
        boolean temLapis = orcamento.temItem("Lapis");
        return 0;
    }

    @Override
    public void setProximo(Desconto desconto) {

    }
}
