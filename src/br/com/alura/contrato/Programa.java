package br.com.alura.contrato;

import java.util.Calendar;
import java.util.Locale;

public class Programa {

    public static void main(String[] args) {
        Historico historico = new Historico();

        Locale ptBR = new Locale("pt", "BR");
        Contrato contrato = new Contrato(Calendar.getInstance(ptBR), "Douglas", TipoContrato.NOVO);

        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        System.out.println(historico.pega(0).getContrato().getTipo());
        System.out.println(historico.pega(1).getContrato().getTipo());
        System.out.println(historico.pega(2).getContrato().getTipo());
    }
}
