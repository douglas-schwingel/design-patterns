package br.com.alura.calculadora;

public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        Orcamento orcamento500 = new Orcamento(500);
        Orcamento orcamento2000 = new Orcamento(2000);
        Orcamento orcamento4000 = new Orcamento(4000);

        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();
        System.out.println("ISS:");
        calculadora.realizaCalculo(orcamento500, iss);
        System.out.println("ICMS:");
        calculadora.realizaCalculo(orcamento500, icms);
        System.out.println("ICCC 500:");
        calculadora.realizaCalculo(orcamento500, iccc);
        System.out.println("ICCC 2000:");
        calculadora.realizaCalculo(orcamento2000, iccc);
        System.out.println("ICCC 4000:");
        calculadora.realizaCalculo(orcamento4000, iccc);
    }

}
