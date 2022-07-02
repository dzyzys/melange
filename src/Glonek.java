public class Glonek {
    double upojenieAlkoholoweWPromilach;
    String imie;
    int wiek;
    double masa;
    int rekordPiw;
    double rekordAlkoholu;

    Glonek(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
    }

    void wypijPiwo(){
        upojenieAlkoholoweWPromilach+=przeliczUpojenie(6, 500);
        rekordPiw++;
        rekordAlkoholu+=przeliczUpojenie(6, 500);
    }

    void wypijPiwo(double woltarz){
        upojenieAlkoholoweWPromilach+=przeliczUpojenie(woltarz, 500);
        rekordPiw++;
        rekordAlkoholu+=przeliczUpojenie(woltarz, 500);
    }

    double iloscAlkoholu(){
        return upojenieAlkoholoweWPromilach;
    }

    void wypijWode(){
        upojenieAlkoholoweWPromilach+=przeliczUpojenie(40, 50);
        rekordAlkoholu+=przeliczUpojenie(40, 50);
    }

    void spij(double iloscGodzin){
        upojenieAlkoholoweWPromilach-=iloscGodzin;
        rekordPiw=0;
        rekordAlkoholu=0;
        if(upojenieAlkoholoweWPromilach<0)upojenieAlkoholoweWPromilach=0;
    }

    void jedzWiejska(double wiejskaWKilo){
        upojenieAlkoholoweWPromilach-=wiejskaWKilo;
        if(upojenieAlkoholoweWPromilach<0)upojenieAlkoholoweWPromilach=0;
    }

    double przeliczUpojenie( double woltarz, int gramaturaWMl ){
        double wspolczynnikQ=0.7;
        double gramyAlkoholu;
        gramyAlkoholu=woltarz*gramaturaWMl*0.01;
        return gramyAlkoholu/(wspolczynnikQ*masa);
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
