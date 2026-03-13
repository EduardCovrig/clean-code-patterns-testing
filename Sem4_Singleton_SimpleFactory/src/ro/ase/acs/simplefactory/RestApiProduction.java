package ro.ase.acs.simplefactory;

public class RestApiProduction implements RestApi{
    RestApiProduction(){}; //default package,
    // ca sa nu se poate face alta instante inafara de cele pentru factory
    @Override
    public void connect() {
        System.out.println("Connecting to the production API...");
    }
}
