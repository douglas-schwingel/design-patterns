package br.com.alura.calculadora.errada;

import br.com.alura.calculadora.Orcamento;

public class TesteCalculadora {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(500);
        var calculadoraAntiga = new CalculadoraAntiga();
        System.out.println("******* ICMS *********");
        calculadoraAntiga.realizaCalculo(orcamento, new ICMS());
        System.out.println("******* ISS *********");
        calculadoraAntiga.realizaCalculo(orcamento, new ISS());
    }
}
