package cerinta8_2026_miercuri.cts.covrig.eduard.gabriel.singletonfactory.X;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry implements ICentru {
    private int noVehicles;
    private String oras;
    private static Map<String,SingletonRegistry> registry=new HashMap<>();
    static
    {
        registry.put("Bucuresti",new SingletonRegistry(4,"Bucuresti"));
        registry.put("Cluj",new SingletonRegistry(10,"Cluj"));
    }

    private SingletonRegistry(int noVehicles, String oras) {
        this.noVehicles = noVehicles;
        this.oras = oras;
    }
    public static SingletonRegistry getInstance(String oras)
    {
        if(registry.containsKey(oras))
        {
            return registry.get(oras);
        }
        throw new IllegalArgumentException("Nu exista orasul "+ oras);
    }



    @Override
    public void inregistreazaVehicul() {
        noVehicles++;
    }

    @Override
    public void trimiteComanda() {
        noVehicles--;
    }

    @Override
    public void veziStatus() {
        System.out.println("Centrul din orasul " + oras + " are "+ noVehicles + ".");
    }


}
