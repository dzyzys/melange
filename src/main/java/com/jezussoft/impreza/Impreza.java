package com.jezussoft.impreza;

import java.util.List;

public class Impreza {
    private boolean czyJestKorsa = true;
    private boolean osobaNiepijaca = false;
    private int szlugi = 0;
    private int piwo = 0;
    private int woda = 0;
    private int wino = 0;
    private List<Czlowiek> listaUczesnikow;
    private String miejsceImprezy;

    public Impreza(String miejsceImprezy, List<Czlowiek> listaUczesnikow){
        this .miejsceImprezy = miejsceImprezy;
        this .listaUczesnikow = listaUczesnikow;
    }

    public void start(){
        String podsumowanie = "w imprezie " +miejsceImprezy+ " udzial wzieli: \n" ;
        for (Czlowiek uczestnik:listaUczesnikow){
            podsumowanie += uczestnik.getImie() + " ma " + uczestnik.getUpojenieAlkoholoweWPromilach() + " promili" + " i wazy " + uczestnik.masa + "\n";
        }
        System.out.println(podsumowanie);
    }


}
