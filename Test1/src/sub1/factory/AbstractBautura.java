package cts.ase.ro.factory;

public abstract class AbstractBautura implements Bautura{
    private String nume;
    private double volum;
    private double pret;

    AbstractBautura(String nume, double volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public void preparare() {

    }

    @Override
    public String getDetalii() {
        return "";
    }

    @Override
    public double getPret() {
        return 0;
    }

    @Override
    public boolean adaugaTopping() {
        return false;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getVolum() {
        return volum;
    }

    public void setVolum(double volum) {
        this.volum = volum;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}
