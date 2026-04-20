package ro.ase.acs.main;

import ro.ase.acs.adapter.*;
import ro.ase.acs.facade.CarFacade;
import ro.ase.acs.proxy.AbstractAuthenticationService;
import ro.ase.acs.proxy.AuthenticationProxy;
import ro.ase.acs.proxy.AuthenticationService;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("--- ADAPTER ---");
        AbstractTrainTicketing trainTicketing=new TrainTicketing();
        trainTicketing.buyTicket(3,30);

        AbstractBusTicketing busTicketing=new BusTicketing();
        busTicketing.reserveSeat();

        trainTicketing=new TicketingObjectAdapter(busTicketing);
        trainTicketing.buyTicket(3,31);

        trainTicketing=new TicketingClassAdapter();
        trainTicketing.buyTicket(4,10);

        System.out.println("--- FACADE ---");
        CarFacade carFacade=new CarFacade();
        carFacade.start();
        System.out.println();
        carFacade.emergencyBrake();
        System.out.println();
        carFacade.park();

        System.out.println("--- PROXY ---");
        AbstractAuthenticationService authenticationService=new AuthenticationService();
        boolean isAuthenticated=authenticationService.login("admin","admin");
        System.out.println(isAuthenticated);

        authenticationService=new AuthenticationProxy(authenticationService);
        for(int i=0;i<5;i++)
        {
            authenticationService.login("x","y");
        }

        isAuthenticated=authenticationService.login("admin","admin");
        System.out.println(isAuthenticated);
    }
}
