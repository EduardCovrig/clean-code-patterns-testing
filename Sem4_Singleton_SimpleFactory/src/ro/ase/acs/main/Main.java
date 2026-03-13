package ro.ase.acs.main;

import ro.ase.acs.simplefactory.ApiType;
import ro.ase.acs.simplefactory.RestApi;
import ro.ase.acs.simplefactory.RestApiFactory;
import ro.ase.acs.simplefactory.RestApiFactoryV2;
import ro.ase.acs.singleton.Logger;
import ro.ase.acs.singleton.LoggerV2;
import ro.ase.acs.singleton.LoggerV3;

public class Main {
    public static void main(String[] args) {
        //Singleton
        Logger logger = Logger.getInstance();
        logger.log("Hello World");

        logger.getInstance().log("Hello World");

        LoggerV2 loggerV2=LoggerV2.instance;
        loggerV2.log("Logger V2");

        loggerV2.instance.log("Logger V2");

        LoggerV3 loggerV3=LoggerV3.INSTANCE;
        loggerV3.log("Logger V3");

        loggerV3.INSTANCE.log("Logger V3");

        //Simple Factory
        RestApiFactory factory=new RestApiFactory();
        RestApi api=factory.getRestApi(RestApiFactory.PRODUCTION); // == "production"
        api.connect();

        RestApiFactoryV2 factoryV2=new RestApiFactoryV2();
        api=factoryV2.getRestApi(ApiType.DEV);
        if(api!=null)
        {
            api.connect();
        }
    }

}
