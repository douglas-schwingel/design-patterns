package br.com.alura.calculadora;

public class EnviadorDeSms implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Enviei SMS");
    }
}
