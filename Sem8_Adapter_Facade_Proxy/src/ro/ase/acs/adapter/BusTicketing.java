package ro.ase.acs.adapter;

public class BusTicketing implements AbstractBusTicketing{
    private static final int MAXIMUM_NUMBER_OF_SEATS=50;
    private int numberOfOccupiedseats=0;

    @Override
    public void reserveSeat() {
        if(numberOfOccupiedseats<MAXIMUM_NUMBER_OF_SEATS)
        {
            System.out.println("Seat reserved");
            numberOfOccupiedseats++;
        }
        else System.out.println("Bus is full");
    }
}
