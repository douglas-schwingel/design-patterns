package br.com.alura.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicas {

    private static Map<String, Nota> notas = new HashMap<String, Nota>();

    static {
        notas.put("do", new Do());
        notas.put("re", new Re());
        notas.put("mi", new Mi());
        notas.put("fa", new Fa());
        notas.put("sol", new Sol());
        notas.put("la", new La());
        notas.put("si", new Si());
    }

    public Nota pega(String nota) {
        return notas.get(nota.toLowerCase());
    }

}
