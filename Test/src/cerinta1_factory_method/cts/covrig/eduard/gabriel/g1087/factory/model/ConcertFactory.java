package cerinta1.cts.covrig.eduard.gabriel.g1087.factory.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ConcertFactory implements IShowFactory{
    private String nume;
    private String locatie;
    private LocalDate data;
    private String gen;
    private List<String> artisti;

    public ConcertFactory(String nume, String locatie, LocalDate data, String gen, List<String> artisti) {
        this.nume = nume;
        this.locatie = locatie;
        this.data = data;
        this.gen = gen;
        this.artisti = new ArrayList<>(artisti);
    }

    @Override
    public IShow createShow() {
        return new Concert(nume,locatie,data,gen,artisti);
    }
}
