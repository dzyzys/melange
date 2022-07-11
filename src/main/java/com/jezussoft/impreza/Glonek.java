package com.jezussoft.impreza;

public class Glonek extends Czlowiek {

    public Glonek(){
        super("Adrian Glonek",29,69.69);
    }

    @Override
    public void jedzWiejska(double wiejskaWKilo) {
        upojenieAlkoholoweWPromilach -= wiejskaWKilo;
        if (upojenieAlkoholoweWPromilach < 0) upojenieAlkoholoweWPromilach = 0;
    }

    public void spijWKorsie(double iloscGodzin){
        upojenieAlkoholoweWPromilach-=iloscGodzin*1.5;
        rekordPiw=0;
        rekordAlkoholu=0;
        if(upojenieAlkoholoweWPromilach<0)upojenieAlkoholoweWPromilach=0;
    }

    @Override
    public String toString() {
        return "Glonek{" +
                "upojenieAlkoholoweWPromilach=" + upojenieAlkoholoweWPromilach +
                ", imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", masa=" + masa +
                ", rekordPiw=" + rekordPiw +
                ", rekordAlkoholu=" + rekordAlkoholu +
                '}';
    }

}
