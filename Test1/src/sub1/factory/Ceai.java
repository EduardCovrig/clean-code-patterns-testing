package cts.ase.ro.factory;

public class Ceai extends AbstractBautura{


    Ceai(String nume, double volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Pentru preparare iti trebuie un plic cu ceai");
    }

}
