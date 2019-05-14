package br.com.alura.banco;

public class XML implements Resposta {

    private Resposta proxima;

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato() == Formato.XML) {

            StringBuilder builder = new StringBuilder();
            builder.append("<conta><titular>");
            builder.append(conta.getNome());
            builder.append("</titular><saldo>");
            builder.append(conta.getSaldo());
            builder.append("</saldo><conta>");
            System.out.println(builder.toString());
        } else {
            proxima.responde(req, conta);
        }
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.proxima = resposta;
    }
}
