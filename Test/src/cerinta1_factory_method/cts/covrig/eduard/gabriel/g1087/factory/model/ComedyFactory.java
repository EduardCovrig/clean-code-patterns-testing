package cerinta1.cts.covrig.eduard.gabriel.g1087.factory.model;

import java.time.LocalDate;

public class ComedyFactory implements IShowFactory {
    private String name;
    private String location;
    private LocalDate dateTime;
    private boolean hasExplicitLanguage;

    public ComedyFactory(String name, String location, LocalDate dateTime, boolean hasExplicitLanguage) {
        this.name = name;
        this.location = location;
        this.dateTime = dateTime;
        this.hasExplicitLanguage = hasExplicitLanguage;
    }

    @Override
    public IShow createShow() {
        return new Comedy(name,location,dateTime,hasExplicitLanguage);
    }
}
