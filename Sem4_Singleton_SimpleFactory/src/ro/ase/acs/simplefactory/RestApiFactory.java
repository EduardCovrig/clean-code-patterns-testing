package ro.ase.acs.simplefactory;

public class RestApiFactory {

    public static final String PRODUCTION = "production";
    public static final String DEVELOPMENT = "development";

    public RestApi getRestApi(String apiType)
    {
        if(PRODUCTION.equalsIgnoreCase(apiType))
            //s-a pus stringul hardcodat primul pentru a evita cazul in care apiType e null,
            //iar "production" nu paote if niciodata null
        {
            return new RestApiProduction();
        }
        else if(DEVELOPMENT.equalsIgnoreCase(apiType))
            //click dreapta -> refactor -> introduce constant pe stringul hardcodat "development"
        {
            return new RestApiDevelopment();
        }
        else throw new IllegalArgumentException("Invalid API type");
    }
}
