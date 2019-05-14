package br.com.alura.calculadora;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteNotaFiscal {

    public static void main(String[] args) {

        CriadorDeNotaFiscal builder = new CriadorDeNotaFiscal();
        builder.paraEmpresa("Caelum");
        builder.comCnpj("12.345.678/0001-12");
        builder.comItem(new ItemDaNota("item1", 200));
        builder.comItem(new ItemDaNota("item2", 150));
        builder.comItem(new ItemDaNota("item3", 100));
        builder.naDataDeHoje();
        builder.comObservacao("Uma observação qualquer");
        builder.comObservacao("Essa linha deve ir abaixo da observação anterior!");

        NotaFiscal nf = builder.constroi();

        System.out.println(nf);

//        System.out.println(nf.getRazaoSocial());
//        System.out.println(nf.getCnpj());
//        System.out.println(nf.getDataDeEmissao());
//        System.out.println(nf.getItens());
//        System.out.println(nf.getValorBruto());
//        System.out.println(nf.getImpostos());
//        System.out.println(nf.getObservacoes());
    }

}
