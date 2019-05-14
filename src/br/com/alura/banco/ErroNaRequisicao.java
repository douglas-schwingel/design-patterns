package br.com.alura.banco;

public class ErroNaRequisicao implements Resposta {
    @Override
    public void responde(Requisicao req, Conta conta) {
        System.out.println("Ocorreu um erro. Verifique o formato e tente novamete.");
    }

    @Override
    public void setProxima(Resposta resposta) {
//        não tem proximo
    }
}
