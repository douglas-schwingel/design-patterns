package br.com.alura.calculadoracientifica;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressaoTest {

    @Test
    public void deveFazerSoma() {
        Expressao soma = new Soma(new Numero(20), new Numero(15));
        Expressao soma2 = new Soma(soma, new Numero(35));
        Expressao soma3 = new Soma(soma, soma2);

        assertEquals(35, soma.avalia(), 0.001);
        assertEquals(70, soma2.avalia(), 0.001);
        assertEquals(105, soma3.avalia(), 0.001);
    }

    @Test
    public void deveFazerSubtracao() {
        Expressao sub = new Subtracao(new Numero(15), new Numero(5));
        Expressao sub2 = new Subtracao(new Numero(80), sub);
        Expressao sub3 = new Subtracao(sub2, sub);

        assertEquals(10, sub.avalia(), 0.001);
        assertEquals(70, sub2.avalia(), 0.001);
        assertEquals(60, sub3.avalia(), 0.001);
    }

    @Test
    public void deveFazerMultiplacacao() {
        Expressao mult = new Multiplicacao(new Numero(2), new Numero(3));
        Expressao mult2 = new Multiplicacao(mult, new Numero(6));
        Expressao mult3 = new Multiplicacao(mult, mult2);

        assertEquals(6, mult.avalia(), 0.0001);
        assertEquals(36, mult2.avalia(), 0.0001);
        assertEquals(216, mult3.avalia(), 0.0001);
    }

    @Test
    public void deveFazerDivisao() {
        Expressao divisao = new Divisao(new Numero(200), new Numero(5));
        Expressao divisao2 = new Divisao(divisao, new Numero(2));
        Expressao divisao3 = new Divisao(divisao, divisao2);

        assertEquals(40, divisao.avalia(), 0.001);
        assertEquals(20, divisao2.avalia(), 0.001);
        assertEquals(2, divisao3.avalia(), 0.001);
    }

    @Test
    public void deveFazerRaizQuadrada() {
        Expressao sqrt = new RaizQuadrada(new Numero(121));
        assertEquals(11, sqrt.avalia(), 0.001);

        sqrt = new RaizQuadrada(new Multiplicacao(new Numero(100), new Numero(4)));
        assertEquals(20, sqrt.avalia(), 0.001);
    }


}