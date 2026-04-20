package cts.ase.ro.prototype.main;

import cts.ase.ro.prototype.model.PrototypeCollection;

public class Main {
    public static void main(String[] args)
    {
        PrototypeCollection prototypeCollection=new PrototypeCollection();
        prototypeCollection.getBautura("Cafea cu lapte").preparare();
    }
}
