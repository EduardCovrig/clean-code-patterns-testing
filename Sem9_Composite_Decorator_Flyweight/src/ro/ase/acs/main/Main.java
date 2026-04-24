package ro.ase.acs.main;

import ro.ase.acs.composite.EmailAddress;
import ro.ase.acs.composite.EmailGroup;
import ro.ase.acs.composite.EmailReceiver;
import ro.ase.acs.decorator.Car;
import ro.ase.acs.decorator.CarWithAlarm;
import ro.ase.acs.decorator.CarWithSportSeats;
import ro.ase.acs.decorator.Vehicle;
import ro.ase.acs.flyweight.CharacterPosition;
import ro.ase.acs.flyweight.CustomCharacter;
import ro.ase.acs.flyweight.CustomCharacterFactory;

public class Main {
    public static void main(String[] args)
    {
        /* COMPOSITE */
        EmailReceiver group1087=new EmailGroup();
        EmailReceiver student1=new EmailAddress("student1@stud.ase.ro");
        EmailReceiver student2=new EmailAddress("student2@stud.ase.ro");

        group1087.addReceiver(student1);
        group1087.addReceiver(student2);

        EmailReceiver seriesC=new EmailGroup();
        EmailReceiver secretariat=new EmailAddress("secretariat@csie.ase.ro");
        seriesC.addReceiver(secretariat);
        seriesC.addReceiver(group1087);
        seriesC.receive("Au intrat bursele");

        /* DECORATOR */
        Car car=new Car();
        car.setProducer("Dacia");
        car.setPrice(10000);
        CarWithAlarm carWithAlarm=new CarWithAlarm(car);
        carWithAlarm.start();
        carWithAlarm.activateAlarm();
        CarWithSportSeats carWithSportSeats=new CarWithSportSeats(carWithAlarm);
        carWithSportSeats.setSeatProducer("Recaro");
        System.out.println(carWithSportSeats.getSeatProducer());
        // carWithSportSeats.activateAlarm() -> nu merge
        carWithSportSeats.stop();

        //Flyweight
        CustomCharacterFactory factory=new CustomCharacterFactory();
        CustomCharacter character1=factory.getCharacter('s');
        character1.display(new CharacterPosition(1,1));

        CustomCharacter character2=factory.getCharacter('n');
        character2.display(new CharacterPosition(1,2));

        CustomCharacter character3=factory.getCharacter('s');
        character3.display(new CharacterPosition(1,3));
    }
}
