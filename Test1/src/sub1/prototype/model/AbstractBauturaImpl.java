package cts.ase.ro.prototype.model;

public class AbstractBauturaImpl extends AbstractBautura implements Cloneable{

    AbstractBauturaImpl(String nume, double volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public AbstractBauturaImpl clone() throws CloneNotSupportedException {
        AbstractBauturaImpl abstractBautura=(AbstractBauturaImpl) super.clone();
        return abstractBautura;
    }
}
