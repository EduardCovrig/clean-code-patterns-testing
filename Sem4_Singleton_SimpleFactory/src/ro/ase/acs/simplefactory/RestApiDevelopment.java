package ro.ase.acs.simplefactory;

public class RestApiDevelopment implements RestApi{

    RestApiDevelopment() {};//default package,
    // ca sa nu se poate face alta instante inafara de cele pentru factory
    @Override
    public void connect() {
        System.out.println("Connecting to the development API...");
    }
}
