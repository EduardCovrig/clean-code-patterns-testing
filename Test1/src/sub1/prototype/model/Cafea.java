package cts.ase.ro.prototype.model;

public class Cafea extends AbstractBauturaImpl {

    Cafea(String nume, double volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Pentru preparare ai nevoie de boabe de cafea");
    }

}
