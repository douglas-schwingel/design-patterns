package br.com.alura.flyweight;

import java.util.Arrays;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        NotasMusicas notas = new NotasMusicas();
        List<Nota> musica = Arrays.asList(
                notas.pega("c#"),
                notas.pega("re"),
                notas.pega("mi"),
                notas.pega("fa"),
                notas.pega("fa"),
                notas.pega("fa"),

                notas.pega("do"),
                notas.pega("re"),
                notas.pega("do"),
                notas.pega("re"),
                notas.pega("re"),
                notas.pega("re"),

                notas.pega("do"),
                notas.pega("sol"),
                notas.pega("fa"),
                notas.pega("mi"),
                notas.pega("mi"),
                notas.pega("mi"),

                notas.pega("do"),
                notas.pega("eb"),
                notas.pega("mi"),
                notas.pega("fa"),
                notas.pega("fa"),
                notas.pega("fa")
                );

        Piano piano = new Piano();
        piano.toca(musica);

    }
}
