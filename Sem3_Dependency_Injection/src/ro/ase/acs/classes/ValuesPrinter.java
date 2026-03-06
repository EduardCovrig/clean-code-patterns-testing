package ro.ase.acs.classes;

import ro.ase.acs.interfaces.AbstractValuesPrinter;

public class ValuesPrinter implements AbstractValuesPrinter {
    @Override
    public void printResult(long value)
    {
        System.out.println("Result = "+ value);
    }
}
