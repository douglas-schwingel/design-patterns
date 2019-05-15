package br.com.alura.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasFactory {

    private static Map<String, Nota> notas = new HashMap<String, Nota>();

    public Map<String, Nota> instaciaNota(String nota) {
        switch (nota) {
            case "do":
                notas.put("do", new Do());
                break;
            case "re":
                notas.put("re", new Re());
                break;
            case "mi":
                notas.put("mi", new Mi());
                break;
            case "fa":
                notas.put("fa", new Fa());
                break;
            case "sol":
                notas.put("sol", new Sol());
                break;
            case "la":
                notas.put("la", new La());
                break;
            case "si":
                notas.put("si", new Si());
                break;
            case "c#":
                notas.put("c#", new CSustenido());
                break;
            case "b#":
                notas.put("b#", new BSustenido());
                break;
            case "eb":
                notas.put("eb", new Eb());
                break;
        }
        return this.notas;

    }
}
