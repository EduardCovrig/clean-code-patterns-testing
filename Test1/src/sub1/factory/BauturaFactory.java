package cts.ase.ro.factory;

public class BauturaFactory {
    public Bautura getBautura(BauturaType bauturaType,String nume, double volum, double pret)
    {
        return switch (bauturaType)
        {
            case CAFEA -> new Cafea(nume,volum,pret);
            case CEAI -> new Ceai(nume,volum,pret);
            case CIOCOLATACALDA -> new CiocolataCalda(nume,volum,pret);
            default -> null;
        };
    }
}
