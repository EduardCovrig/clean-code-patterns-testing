package ro.ase.acs.proxy;

public class AuthenticationProxy implements AbstractAuthenticationService{
    private final AbstractAuthenticationService abstractAuthenticationService;
    private int numberOfFailedAttempts=0;
    private static final int MAX_NUMBER_OF_ATTEMPTS=5;

    public AuthenticationProxy(AbstractAuthenticationService abstractAuthenticationService) {
        this.abstractAuthenticationService = abstractAuthenticationService;
    }

    @Override
    public boolean login(String username, String password) {
        if(numberOfFailedAttempts>=MAX_NUMBER_OF_ATTEMPTS)
            return false;
        boolean isSuccessful= abstractAuthenticationService.login(username,password);
        if(isSuccessful) {
            numberOfFailedAttempts=0;
            return true;
        }
        else {
            numberOfFailedAttempts++;
            return false; }
    }
}
