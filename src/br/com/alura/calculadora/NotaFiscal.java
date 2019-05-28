package br.com.alura.calculadora;

import java.util.Collections;
import java.util.List;

public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private String dataDeEmissao;
    private double valorBruto;
    private double impostos;
    private List<ItemDaNota> itens;
    private String observacoes;

    public NotaFiscal(String razaoSocial, String cnpj, String dataDeEmissao, double valorBruto, double impostos, List<ItemDaNota> itens, String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataDeEmissao = dataDeEmissao;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.itens = itens;
        this.observacoes = observacoes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getDataDeEmissao() {
        return dataDeEmissao;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public double getImpostos() {
        return impostos;
    }

    public List<ItemDaNota> getItens() {
        return Collections.unmodifiableList(this.itens);
    }

    public String getObservacoes() {
        return observacoes;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Razão Social: " + this.razaoSocial);
        builder.append("\n");
        builder.append("CNPJ: " + this.cnpj);
        builder.append("\n");
        builder.append("Data da Emissão: " + this.dataDeEmissao);
        builder.append("\n");
        builder.append("Valor: R$" + this.valorBruto);
        return builder.toString();
    }
}
