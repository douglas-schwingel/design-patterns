package br.com.alura.calculadora;

import java.util.ArrayList;
import java.util.List;

public class TestaAcoes {

    public static void main(String[] args) {
        AcaoAposGerarNota[] acoes = new AcaoAposGerarNota[]{
                new Impressora(),
                new EnviadorDeEmail(),
                new EnviadorDeSms(),
                new Multiplicador(5.5)};
//        List<AcaoAposGerarNota> acoes = new ArrayList<>();
//        acoes.add(new Impressora());
//        acoes.add(new EnviadorDeSms());
        NotaFiscalBuilder builder = new NotaFiscalBuilder(acoes);
        builder.paraEmpresa("Caelum").comCnpj("112.345.678/0001-12").naDataDeHoje()
                .comItem(new ItemDaNota("item1", 150))
                .comItem(new ItemDaNota("item2", 200)).comObservacao("Bem observado");

        NotaFiscal nf = builder.constroi();
        System.out.println(nf);
    }
}
