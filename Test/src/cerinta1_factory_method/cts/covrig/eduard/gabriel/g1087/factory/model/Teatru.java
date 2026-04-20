package cerinta1.cts.covrig.eduard.gabriel.g1087.factory.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teatru implements IShow{
    private String nume;
    private String locatie;
    private LocalDate data;
    private String regizor;
    private List<String> actori;

    public Teatru(String nume, String locatie, LocalDate data, String regizor, List<String> actori) {
        this.nume = nume;
        this.locatie = locatie;
        this.data = data;
        this.regizor = regizor;
        this.actori = new ArrayList<>(actori);
    }

    @Override
    public void printDetails() {

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
