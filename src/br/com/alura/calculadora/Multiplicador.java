package br.com.alura.calculadora;

public class Multiplicador implements AcaoAposGerarNota {

    private double valor;

    public Multiplicador(double valor) {
        this.valor = valor;
    }

    @Override
    public void executa(NotaFiscal nf) {
        System.out.print("ValorBruto multiplicado por " + this.valor + "= ");
        System.out.println(nf.getValorBruto() * this.valor);
    }
}
