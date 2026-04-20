package cts.ase.ro.prototype.model;

public class CiocolataCalda extends AbstractBauturaImpl {


    CiocolataCalda(String nume, double volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Pentru preparare iti trebuie ciocolata");
    }

}
