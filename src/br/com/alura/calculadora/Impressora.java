package br.com.alura.calculadora;

public class Impressora implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Imprimindo nota fiscal de " + nf.getRazaoSocial() + " na data " + nf.getDataDeEmissao());
    }
}
