package com.jezussoft.impreza;

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
