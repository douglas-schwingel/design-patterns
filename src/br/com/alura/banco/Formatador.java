package br.com.alura.banco;

public class Formatador {

    public void formata() {
        Resposta xml = new XML();
        Resposta csv = new CSV();
        Resposta porcento = new Porcento();
        Resposta invalido = new ErroNaRequisicao();

        xml.setProxima(csv);
        csv.setProxima(porcento);
        porcento.setProxima(invalido);

    }

}
