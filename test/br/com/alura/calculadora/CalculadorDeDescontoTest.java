package br.com.alura.calculadora;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadorDeDescontoTest {

    private Item lapis;
    private Item caneta;
    private Item borracha;
    private CalculadorDeDesconto calculadorDeDescontos;

    @Before
    public void setUp()  {
        calculadorDeDescontos = new CalculadorDeDesconto();
        lapis = new Item("Lapis", 250);
        caneta = new Item("Caneta", 250);
        borracha = new Item("Borracha", 50);
    }

    @Test
    public void deveRetornarDescontoVendaCasada() {
        Orcamento orcamento = new Orcamento(500);

        orcamento.adicionaItem(lapis);
        orcamento.adicionaItem(caneta);

        assertEquals(25, calculadorDeDescontos.calcula(orcamento), 0.0001);
    }

    @Test
    public void naoDeveRetornarDesconto() {
        Orcamento orcamento = new Orcamento(300);
        orcamento.adicionaItem(lapis);
        orcamento.adicionaItem(borracha);

        assertEquals(0, calculadorDeDescontos.calcula(orcamento), 0.001);
    }

    @Test
    public void deveRetornarDescontoPorMaisDeCincoItens() {
        Orcamento orcamento = new Orcamento(500);
        orcamento.adicionaItem(borracha);
        orcamento.adicionaItem(caneta);
        orcamento.adicionaItem(new Item("Estojo", 10));
        orcamento.adicionaItem(new Item("Mochila", 10));
        orcamento.adicionaItem(new Item("Apagador", 10));
        orcamento.adicionaItem(new Item("Apontador", 10));

        assertEquals(50, calculadorDeDescontos.calcula(orcamento), 0.001);
    }
}