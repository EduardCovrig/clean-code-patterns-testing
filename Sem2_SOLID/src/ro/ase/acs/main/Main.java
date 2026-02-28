package ro.ase.acs.main;

import ro.ase.acs.classes.AverageCalculator;
import ro.ase.acs.classes.ValuePrinter;
import ro.ase.acs.classes.ValuesReader;
import ro.ase.acs.interfaces.AbstractCalculator;

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
       Orchestrator orchestrator=new Orchestrator(new AverageCalculator(), new ValuesReader(),new ValuePrinter());
       orchestrator.execute();
    }
}
