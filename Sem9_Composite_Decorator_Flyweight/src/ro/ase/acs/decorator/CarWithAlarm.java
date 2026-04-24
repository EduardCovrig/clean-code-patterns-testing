package ro.ase.acs.decorator;

public class CarWithAlarm extends AbstractCarDecorator{
    public CarWithAlarm(Vehicle vehicle) {
        super(vehicle);
    }
    public void activateAlarm()
    {
        System.out.println("Activating Alarm");
    }

    @Override
    public void stop() {
        super.stop();
        activateAlarm();
    }
}
