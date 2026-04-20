package cerinta1.cts.covrig.eduard.gabriel.g1087.factory.model;

import java.time.LocalDate;
import java.util.List;

public class Concert implements IShow{
    private String nume;
    private String locatie;
    private LocalDate data;
    private String gen;
    private List<String> artisti;

    public Concert(String nume, String locatie, LocalDate data, String gen, List<String> artisti) {
        this.nume = nume;
        this.locatie = locatie;
        this.data = data;
        this.gen = gen;
        this.artisti = artisti;
    }

    @Override
    public void printDetails() {
        System.out.println(nume+locatie+data+gen+artisti);
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
