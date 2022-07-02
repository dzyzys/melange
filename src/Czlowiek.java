public class Czlowiek {
    protected double upojenieAlkoholoweWPromilach;
    protected String imie;
    protected int wiek;
    protected double masa;
    protected int rekordPiw;
    protected double rekordAlkoholu;

    public Czlowiek(String imie, int wiek, double masa){
        this.imie = imie;
        this.wiek = wiek;
        this.masa = masa;
    }

    public void wypijPiwo(){
        upojenieAlkoholoweWPromilach+=przeliczUpojenie(6, 500);
        rekordPiw++;
        rekordAlkoholu+=przeliczUpojenie(6, 500);
    }

    public void wypijPiwo(double woltarz){
        upojenieAlkoholoweWPromilach+=przeliczUpojenie(woltarz, 500);
        rekordPiw++;
        rekordAlkoholu+=przeliczUpojenie(woltarz, 500);
    }

    public double iloscAlkoholu(){
        return upojenieAlkoholoweWPromilach;
    }

    public void wypijWode(){
        upojenieAlkoholoweWPromilach+=przeliczUpojenie(40, 50);
        rekordAlkoholu+=przeliczUpojenie(40, 50);
    }

   public void spij(double iloscGodzin){
        upojenieAlkoholoweWPromilach-=iloscGodzin;
        rekordPiw=0;
        rekordAlkoholu=0;
        if(upojenieAlkoholoweWPromilach<0)upojenieAlkoholoweWPromilach=0;
    }

    public void jedzWiejska(double wiejskaWKilo){
        masa+=wiejskaWKilo;
    }

    private double przeliczUpojenie( double woltarz, int gramaturaWMl ){
        double wspolczynnikQ=0.7;
        double gramyAlkoholu;
        gramyAlkoholu=woltarz*gramaturaWMl*0.01;
        return gramyAlkoholu/(wspolczynnikQ*masa);
    }

    public double getUpojenieAlkoholoweWPromilach() {
        return upojenieAlkoholoweWPromilach;
    }

    public void setUpojenieAlkoholoweWPromilach(double upojenieAlkoholoweWPromilach) {
        this.upojenieAlkoholoweWPromilach = upojenieAlkoholoweWPromilach;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public int getRekordPiw() {
        return rekordPiw;
    }

    public void setRekordPiw(int rekordPiw) {
        this.rekordPiw = rekordPiw;
    }

    public double getRekordAlkoholu() {
        return rekordAlkoholu;
    }

    public void setRekordAlkoholu(double rekordAlkoholu) {
        this.rekordAlkoholu = rekordAlkoholu;
    }
}
