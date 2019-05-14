package br.com.alura.calculadora.desconto;

import br.com.alura.calculadora.Orcamento;

public class TesteDeDescontoExtra {

    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500.0);

        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor()); // imprime 475,00 pois descontou 5%
        reforma.aprova(); // aprova nota!

        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor()); // imprime 465,50 pois descontou 2%

        reforma.finaliza();
//        reforma.aplicaDescontoExtra();  // lançaria exceção por já estar finalizado
//        reforma.aprova();
    }
}
