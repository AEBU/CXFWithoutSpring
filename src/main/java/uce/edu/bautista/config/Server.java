package uce.edu.bautista.config;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import uce.edu.bautista.services.HolaService;

/**
 * Created by Alexis on 31/01/2018.
 */
public class Server {

     Server() throws Exception {
        JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
        sf.setResourceClasses(HolaService.class);
        sf.setResourceProvider(HolaService.class,
                new SingletonResourceProvider(new HolaService()));
        sf.setAddress("http://localhost:9090/");

        sf.create();
    }

    public static void main(String args[]) throws Exception {
        new Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 6000 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
