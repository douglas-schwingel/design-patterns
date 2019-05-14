package br.com.alura.calculadora;

public class DescontoParaVendaCasada implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if(aconteceuVendaCasada(orcamento, "Lapis", "Caneta")) return orcamento.getValor() * 0.05;
        else return proximo.desconta(orcamento);
    }

    private boolean aconteceuVendaCasada(Orcamento orcamento, String item1, String item2) {
        return orcamento.temItem(item1) && orcamento.temItem(item2);
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.proximo = desconto;
    }
}
