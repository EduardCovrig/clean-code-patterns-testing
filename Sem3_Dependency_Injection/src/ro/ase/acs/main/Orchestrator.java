package ro.ase.acs.main;

import ro.ase.acs.dip.ServiceLocator;
import ro.ase.acs.exceptions.DependencyNotSetException;
import ro.ase.acs.interfaces.AbstractCalculator;
import ro.ase.acs.interfaces.AbstractValuesPrinter;
import ro.ase.acs.interfaces.AbstractValuesReader;

import java.util.List;

public class Orchestrator {
    private final AbstractValuesReader valuesReader;
    private AbstractCalculator calculator;
    private final AbstractValuesPrinter valuesPrinter;

    public Orchestrator(AbstractValuesReader reader, AbstractValuesPrinter printer) {
        this.valuesReader = reader;
        this.valuesPrinter = printer;
    }

    public Orchestrator(AbstractValuesReader reader, AbstractCalculator calculator, AbstractValuesPrinter printer) {
        this.valuesReader = reader;
        this.calculator = calculator;
        this.valuesPrinter = printer;
    }
    public Orchestrator(ServiceLocator serviceLocator)
    {
        valuesReader= (AbstractValuesReader) serviceLocator.resolve("AbstractValuesReader");
        calculator=(AbstractCalculator) serviceLocator.resolve(AbstractCalculator.class.getSimpleName());
        valuesPrinter=(AbstractValuesPrinter) serviceLocator.resolve(AbstractValuesPrinter.class.getSimpleName());
    }

    public void setCalculator(AbstractCalculator calculator) {
        this.calculator = calculator;
    }

    public void execute() throws DependencyNotSetException {
        if(calculator==null) {
            throw new DependencyNotSetException();
        }
        else {
            List<Integer> list = valuesReader.readValues(5);
            Long result = calculator.compute(list);
            valuesPrinter.printResult(result);
        }

    }
}
