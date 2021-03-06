package br.com.alura.banco;

public class Porcento implements Resposta {

    private Resposta proxima;

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato() == Formato.PORCENTO) {
            System.out.println(conta.getNome() + "%" + conta.getSaldo());
        } else {
            proxima.responde(req, conta);
        }
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.proxima = resposta;
    }
}
