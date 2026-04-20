package cts.ase.ro.factory;

public class CiocolataCalda extends AbstractBautura{


    CiocolataCalda(String nume, double volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Pentru preparare iti trebuie ciocolata");
    }

}
