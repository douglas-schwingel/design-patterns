package br.com.alura.calculadora;

public class TesteNotaFiscal {

    public static void main(String[] args) {

//        NotaFiscal notaFiscal = new NotaFiscal("BalasJuquinha", "12.345.678/0001-12",
//                "12/12/06",200,50,null,"obbservado");

        NotaFiscalBuilder builder = new NotaFiscalBuilder()
                .paraEmpresa("Caelum")
                .comCnpj("12.345.678/0001-12")
                .comItem(new ItemDaNota("item1", 200))
                .comItem(new ItemDaNota("item2", 150))
                .comItem(new ItemDaNota("item3", 100))
                .naDataDeHoje()
                .comObservacao("Uma observação qualquer")
                .comObservacao("Essa linha deve ir abaixo da observação anterior!");

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
