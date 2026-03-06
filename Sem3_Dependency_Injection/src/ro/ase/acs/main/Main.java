package ro.ase.acs.main;

import ro.ase.acs.classes.AverageCalculator;
import ro.ase.acs.classes.ValuesPrinter;
import ro.ase.acs.classes.ValuesReader;
import ro.ase.acs.dip.IocContainer;
import ro.ase.acs.dip.ServiceLocator;
import ro.ase.acs.exceptions.DependencyNotSetException;
import ro.ase.acs.interfaces.AbstractCalculator;
import ro.ase.acs.interfaces.AbstractValuesPrinter;
import ro.ase.acs.interfaces.AbstractValuesReader;

/* SOLID
 S -> S.R.P (O clasa trebuie sa aiba o singura responsabilitate/ singur motiv pentru a o modifica_
 (Single Responsibility Principle)
 O -> O.C.P (O clasa trebuie sa fie deschisa pentru derivari, dar inchisa pentru modificari)
 (Open-Close Principle)
 L -> L.S.P (Daca o clasa raspunde la "is a", dar nu raspunde la "is a substitute of", nu mai facem derivarea intre cele doua)
 (Liskov Substitution Principle)
 I -> I.S.P (Sunt preferate interfete mici, cu putine metode)
 (Interface Segregation Principle)
 D -> D.S.P (Clasele concrete trebuie sa depinda doar de abstractizari. Sa nu existe has a intre clasa - clasa,
 doar clasa -> interfata/abstracta)
 (Dependency Inversion Principle)
*/
public class Main {
    public static void main(String[] args)
    {
        //Option 1: constructor & setter injection
        Orchestrator orchestrator=new Orchestrator(new ValuesReader(),new ValuesPrinter());
        orchestrator.setCalculator(new AverageCalculator());
        try {
            orchestrator.execute();
        } catch (DependencyNotSetException e) {
            e.printStackTrace();
        }

        //Option 2: ServiceLocator
        ServiceLocator serviceLocator=new ServiceLocator();
        serviceLocator.register(AbstractValuesReader.class.getSimpleName(), new ValuesReader());
        serviceLocator.register(AbstractCalculator.class.getSimpleName(), new AverageCalculator());
        serviceLocator.register(AbstractValuesPrinter.class.getSimpleName(), new ValuesPrinter());

        Orchestrator orchestrator2=new Orchestrator(serviceLocator);
        try {
            orchestrator2.execute();
        } catch (DependencyNotSetException e) {
            e.printStackTrace();
        }

        //Option 3: IoC Container
        IocContainer iocContainer=new IocContainer();
        iocContainer.register(AbstractValuesReader.class.getName(),ValuesReader.class.getName());
        iocContainer.register(AbstractCalculator.class.getName(),AverageCalculator.class.getName() );
        iocContainer.register(AbstractValuesPrinter.class.getName(), ValuesPrinter.class.getName());
        iocContainer.register(Orchestrator.class.getName(),Orchestrator.class.getName());

        Orchestrator orchestrator3=iocContainer.initialize();
        try
        {
            orchestrator3.execute();
        } catch (DependencyNotSetException e) {
            e.printStackTrace();
        }
    }
}
