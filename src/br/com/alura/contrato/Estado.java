package br.com.alura.contrato;

public class Estado {

    private Contrato contrato;

    public Estado(Contrato contrato) {
        this.contrato = contrato;
    }

    public Contrato getContrato(){
        return this.contrato;
    }
}
