package br.com.alura.flyweight;

import org.jfugue.player.Player;

import java.util.List;

public class Piano {

    public void toca(List<Nota> notas) {
        Player player = new Player();

        StringBuilder builder = new StringBuilder();
        for (Nota nota : notas) {
            builder.append(nota.simbolo() + " ");
        }
        String musicaEmNotas = builder.toString();
        System.out.println(musicaEmNotas);
        player.play(musicaEmNotas);
    }
}
