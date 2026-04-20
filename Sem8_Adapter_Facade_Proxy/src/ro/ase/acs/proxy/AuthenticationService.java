package ro.ase.acs.proxy;

public class AuthenticationService implements AbstractAuthenticationService {

    private static final String ADMIN_PASSWORD = "admin";
    private static final String ADMIN_USERNAME = ADMIN_PASSWORD;

    @Override
    public boolean login(String username, String password){
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }

}
