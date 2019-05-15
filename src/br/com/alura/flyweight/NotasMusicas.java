package br.com.alura.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicas {

    private static Map<String, Nota> notas = new HashMap<>();

    public Nota pega(String nota) {
        if(!notas.containsKey(nota.toLowerCase())){
            this.notas = new NotasFactory().instaciaNota(nota.toLowerCase());
        }
        return notas.get(nota.toLowerCase());
    }

}
