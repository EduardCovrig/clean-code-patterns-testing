package cerinta7.Factory;

public class Cafea implements IBautura{
    private String nume;
    private double volum;
    private double pret;

    Cafea(String nume, double volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing coffee");
    }
}
