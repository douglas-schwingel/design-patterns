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
        assertEquals(50, new ICMS().calcula(orcamento), 0.00001);
    }

    @Test
    public void deveRetornarISS() {
        assertEquals(102, new ISS().calcula(orcamento2), 0.001);
    }

    @Test
    public void deveEntenderICPPMinimo() {
        assertEquals(25, new ICPP().calcula(orcamento), 0.001);
    }

    @Test
    public void deveEntenderICPPMaximo() {
        assertEquals(119, new ICPP().calcula(orcamento2), 0.001);
    }

    @Test
    public void deveEntenderIKCVMinimo() {
        assertEquals(30, new IKCV().calcula(orcamento), 0.001);
    }

    @Test
    public void deveEntenderIKCVPMaximo() {
        orcamento2.adicionaItem(new Item("Lapis", 250));
        assertEquals(170, new IKCV().calcula(orcamento2), 0.001);
    }


}
