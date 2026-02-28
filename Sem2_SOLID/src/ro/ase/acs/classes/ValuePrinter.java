package ro.ase.acs.classes;

import ro.ase.acs.interfaces.AbstractPrinter;

public class ValuePrinter implements AbstractPrinter {
    @Override
    public void printResult(long value)
    {
        System.out.println("Result = "+ value);
    }
}
