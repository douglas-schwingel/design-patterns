package br.com.alura.calculadora;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class CriadorDeNotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
    private double valorBruto;
    private double impostos;
    private String dataDeEmissao;
    private StringBuilder builder = new StringBuilder();

    public void paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void comCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void comItem(ItemDaNota item) {
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;
    }

    public void naDataDeHoje() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dataDeEmissao = dateFormat.format(Calendar.getInstance().getTime());
    }

    public void comObservacao(String observação) {
        builder.append(observação);
        builder.append("\n");
    }

    private String constroiObservacoes() {
        return builder.toString();
    }

    public NotaFiscal constroi() {
        return new NotaFiscal(razaoSocial,cnpj,dataDeEmissao,valorBruto,impostos,todosItens,constroiObservacoes());
    }
}
