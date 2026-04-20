package cts.ase.ro.prototype.model;

import java.util.HashMap;
import java.util.Map;

public class PrototypeCollection {
    private Map<String,Bautura> collection=new HashMap<>();

    public PrototypeCollection()
    {
        collection.put("Cafea cu lapte",new Cafea("Cafea cu lapte",250,30));
        collection.put("Cappuccino",new Cafea("Cappuccino",300,40));
        collection.put("Cafea neagra",new Cafea("Cafea neagra",200,20));
        collection.put("Ceai negru",new Ceai("Ceai negru",300,15));
    }

    public AbstractBauturaImpl getBautura(String bautura)
    {
        try {
            return ((AbstractBauturaImpl)collection.get(bautura)).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
