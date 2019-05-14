package br.com.alura.banco;

public interface Resposta {

    void responde(Requisicao req, Conta conta);
    void setProxima(Resposta resposta);
}
