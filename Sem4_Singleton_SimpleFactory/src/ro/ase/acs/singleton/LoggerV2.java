package ro.ase.acs.singleton;

import java.time.LocalDateTime;

public class LoggerV2 { //EAGER
    private LoggerV2(){};
    public final static LoggerV2 instance = new LoggerV2();
    //implicit thread-safe, facand initializarea asa.

    public void log(String message)
    {
        System.out.println(LocalDateTime.now() + ": "+ message);
    }
}
