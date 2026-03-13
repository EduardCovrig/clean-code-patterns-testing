package ro.ase.acs.singleton;

import java.time.LocalDateTime;

public class Logger { //LAZY
    private static Logger instance;
    private Logger()
    {
    }
    public static synchronized Logger getInstance()
    //synchronized pentru a fi thread-safe, in caz de apelam getInstance din mai multe thread-uri
    {
        if(instance==null)
            instance=new Logger();
        return instance;
    }

    public void log(String message)
    {
        System.out.println(LocalDateTime.now() + ": "+ message);
    }
}
