package com.jezussoft;

import com.jezussoft.impreza.Alkohole;
import com.jezussoft.impreza.Czlowiek;
import com.jezussoft.impreza.Glonek;
import com.jezussoft.impreza.Impreza;

import java.util.LinkedList;
import java.util.List;

public class Melange {
    public static void main(String[] args){
        /* Tutaj zaczyna się program */
        imprezuj();
    }

    private static void imprezuj() {
        System.out.println("glonek jest alkusem");
        Glonek glonek1 = new Glonek();
        glonek1.setMasa(49);
        Glonek glonek2 = new Glonek();
        System.out.println(glonek1);
        glonek1.wypijPiwo(2.1);
        glonek1.wypijPiwo();
        glonek1.wypijWode();
        glonek1.wypijWode();
        glonek1.wypijWode();
        glonek1.wypijWode();
        glonek1.wypijWode();
        glonek1.jedzWiejska(1);
        glonek1.spij(3);

        System.out.println(glonek1.iloscAlkoholu());

        Czlowiek agrawka = new Czlowiek("Agrawka",29,21.37);
        agrawka.setImie("agrawka");

        agrawka.wypijPiwo();
        agrawka.wypijWode();
        agrawka.wypijWode();
        agrawka.spij(1);
        agrawka.jedzWiejska(2);
        List<Czlowiek> osobyNaIprezie1 = new LinkedList<>();
        osobyNaIprezie1.add(glonek1);
        osobyNaIprezie1.add(glonek2);
        osobyNaIprezie1.add(agrawka);
        Impreza popijawa = new Impreza("zajazd",osobyNaIprezie1);
        popijawa.start();

        // alkohole
        Alkohole harnold = new Alkohole("harnold",6.0,500,"piwo",0);
        Alkohole radlerek = new Alkohole("radlerek",2.0,500,"piwo",0);
        Alkohole dzik = new Alkohole("dzik",6.0,500,"piwo",0);
        Alkohole kasztelanChuj = new Alkohole("kasztelanChuj",4.6,500,"piwo",0);
        Alkohole polowka = new Alkohole("polowka",40.0,500,"woda",0);
        Alkohole zeroSiedem = new Alkohole("zeroSiedem",40.0,700,"woda",0);
        Alkohole winko = new Alkohole("winko",10.0,700,"wino",0);
        Alkohole amarena = new Alkohole("amarena",12.0,700,"wino",0);
        Alkohole przepoja = new Alkohole("przepoja", 0.0,2000,"przepoja",0);
        Alkohole woda = new Alkohole("woda",0.0,1500,"przepoja",0);
    }
}
