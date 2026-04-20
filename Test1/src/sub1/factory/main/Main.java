package cts.ase.ro.factory.main;

import cts.ase.ro.factory.Bautura;
import cts.ase.ro.factory.BauturaFactory;
import cts.ase.ro.factory.BauturaType;

public class Main {
    public static void main(String[] args)
    {
        BauturaFactory bauturaFactory=new BauturaFactory();
        Bautura cafea=bauturaFactory.getBautura(BauturaType.CAFEA,"Cafea premium",40,10);
        Bautura cafea2=bauturaFactory.getBautura(BauturaType.CAFEA,"Cafea basic",10,20);
        Bautura ceai=bauturaFactory.getBautura(BauturaType.CEAI,"Ceai de musetel",30,40);
        Bautura ciocolata=bauturaFactory.getBautura(BauturaType.CIOCOLATACALDA,"Ciocolata calda",30,20);
        cafea.preparare();
        cafea2.preparare();
        ceai.preparare();
        ciocolata.preparare();
    }
}
