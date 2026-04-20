package cts.ase.ro.prototype.model;

public class Ceai extends AbstractBauturaImpl {


    Ceai(String nume, double volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Pentru preparare iti trebuie un plic cu ceai");
    }

}
