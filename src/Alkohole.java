public class Alkohole {
    protected String nazwa;
    protected double moc;
    protected int pojemnoscWMl;
    protected String typAlkoholu;
    protected int ileZostaloWSztukach;

    public Alkohole(String nazwa, double moc, int pojemnoscWMl, String typAlkoholu, int ileZostaloWSztukach){
        this.nazwa = nazwa;
        this.moc = moc;
        this.pojemnoscWMl = pojemnoscWMl;
        this.typAlkoholu = typAlkoholu;
        this.ileZostaloWSztukach = ileZostaloWSztukach;
    }
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

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getMoc() {
        return moc;
    }

    public void setMoc(double moc) {
        this.moc = moc;
    }

    public int getPojemnoscWMl() {
        return pojemnoscWMl;
    }

    public void setPojemnoscWMl(int pojemnoscWMl) {
        this.pojemnoscWMl = pojemnoscWMl;
    }

    public String getTypAlkoholu() {
        return typAlkoholu;
    }

    public void setTypAlkoholu(String typAlkoholu) {
        this.typAlkoholu = typAlkoholu;
    }

    public int getIleZostaloWSztukach() {
        return ileZostaloWSztukach;
    }

    public void setIleZostalo(int ileZostaloWSztukach) {
        this.ileZostaloWSztukach = ileZostaloWSztukach;
    }
}
