package cerinta1.cts.covrig.eduard.gabriel.g1087.factory.model;

import java.time.LocalDate;

public class Comedy implements IShow{
    private String nume;
    private String locatie;
    private LocalDate data;
    private boolean licentios;

    public Comedy(String nume, String locatie, LocalDate data, boolean licentios) {
        this.nume = nume;
        this.locatie = locatie;
        this.data = data;
        this.licentios = licentios;
    }

    @Override
    public void printDetails() {
        System.out.println(nume + locatie + data + licentios);
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getLocation() {
        return "";
    }

    @Override
    public String getDateTime() {
        return "";
    }
}
