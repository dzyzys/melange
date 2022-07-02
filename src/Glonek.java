public class Glonek extends Czlowiek {

    Glonek(){
        super("Glonek",29,69.69);
    }
    @Override
    public void jedzWiejska(double wiejskaWKilo) {
        upojenieAlkoholoweWPromilach -= wiejskaWKilo;
        if (upojenieAlkoholoweWPromilach < 0) upojenieAlkoholoweWPromilach = 0;
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
