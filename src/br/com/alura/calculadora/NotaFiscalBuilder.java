package br.com.alura.calculadora;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
    private double valorBruto;
    private double impostos;
    private String dataDeEmissao;
    private StringBuilder builder = new StringBuilder();

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item) {
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuilder naDataDeHoje() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dataDeEmissao = dateFormat.format(Calendar.getInstance().getTime());
        return this;
    }

    public NotaFiscalBuilder comObservacao(String observação) {
        builder.append(observação);
        builder.append("\n");
        return this;
    }

    private String constroiObservacoes() {
        return builder.toString();
    }

    public NotaFiscal constroi() {
        return new NotaFiscal(razaoSocial,cnpj,dataDeEmissao,valorBruto,impostos,todosItens,constroiObservacoes());
    }
}
