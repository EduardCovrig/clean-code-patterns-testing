package cts.ase.ro.factory;

public class Cafea extends AbstractBautura{

    Cafea(String nume, double volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Pentru preparare ai nevoie de boabe de cafea");
    }

}
