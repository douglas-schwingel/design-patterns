package br.com.alura.calculadora;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadorDeImpostosTest {

    private Orcamento orcamento;
    private Orcamento orcamento2;

    @Before
    public void setUp() {
        orcamento = new Orcamento(500);
        orcamento2 = new Orcamento(1700);

    }

    @Test
    public void deveRetornarICMS() {
        CalculadorDeImpostos calculador = new CalculadorDeImpostos();
        calculador.realizaCalculo(orcamento, new ICMS());

        assertEquals(50, new ICMS().calcula(orcamento), 0.00001);
    }

    @Test
    public void deveRetornarISS() {
        assertEquals(102, new ISS().calcula(orcamento2), 0.001);
    }

}
