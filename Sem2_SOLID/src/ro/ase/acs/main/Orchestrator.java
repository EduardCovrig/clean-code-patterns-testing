package ro.ase.acs.main;

import ro.ase.acs.interfaces.AbstractCalculator;
import ro.ase.acs.interfaces.AbstractPrinter;
import ro.ase.acs.interfaces.AbstractReader;

import java.util.List;

public class Orchestrator {
    private final AbstractReader reader;
    private final AbstractCalculator calculator;
    private final AbstractPrinter printer;

    public Orchestrator(AbstractCalculator calculator, AbstractReader reader, AbstractPrinter printer) {
        this.reader = reader;
        this.calculator = calculator;
        this.printer = printer;
    }

    public void execute(){

        List<Integer> list=reader.readValues(5);
        Long result=calculator.compute(list);
        printer.printResult(result);
    }
}
