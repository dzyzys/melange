public class Glonek extends Czlowiek {

    Glonek(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
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
