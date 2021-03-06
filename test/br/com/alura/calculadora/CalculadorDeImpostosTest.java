package br.com.alura.calculadora;

import br.com.alura.calculadora.impostos.*;
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

    @Test
    public void deveEntenderIHITMinimo() {
        Orcamento orcamentoIHIT = new Orcamento(500);
        orcamentoIHIT.adicionaItem(new Item("Lapis", 100));
        orcamentoIHIT.adicionaItem(new Item("Borracha", 15));
        assertEquals(10, new IHIT().calcula(orcamentoIHIT), 0.001);
    }

    @Test
    public void deveEntenderIHITMaximo() {
        Orcamento orcamentoIHIT = new Orcamento(500);
        orcamentoIHIT.adicionaItem(new Item("Lapis", 100));
        orcamentoIHIT.adicionaItem(new Item("Borracha", 15));
        orcamentoIHIT.adicionaItem(new Item("Lapis", 200));
        assertEquals(165, new IHIT().calcula(orcamentoIHIT), 0.001);
    }

    @Test
    public void deveEntenderImpostoComposto() {
        Imposto issEIcms = new ISS(new ICMS());
        Orcamento orcamento = new Orcamento(500);

        double valor = issEIcms.calcula(orcamento);
        assertEquals(80, valor, 0.00001);
    }

    @Test
    public void deveCalcularImpostoMuitoAlto() {
        Imposto imaEISS = new IMA(new ISS());
        Orcamento orcamento = new Orcamento(500);

        double valor = imaEISS.calcula(orcamento);
        assertEquals(130, valor, 0.00001);
    }

    @Test
    public void deveCalcularImpostosCondicionaisCompostos() {
        Imposto ikcvEIcpp = new IKCV(new ICPP());
        Orcamento orcamento = new Orcamento(500);

        double valor = ikcvEIcpp.calcula(orcamento);

        assertEquals(55, valor, 0.0001);

    }


}
