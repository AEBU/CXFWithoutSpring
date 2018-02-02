package uce.edu.bautista.config;

import uce.edu.bautista.services.HolaService;

import java.util.*;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Created by Alexis on 31/01/2018.
 */
@ApplicationPath("/api")
public class ConfigServer
        extends Application
{

//    public Map<String, Object> getProperties() {
//        Map<String, Object> properties = new HashMap<String, Object>();
//        properties.put("jersey.config.server.provider.packages", "uce.edu.bautista.services");
//        return properties;
//    }

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(HolaService.class);
        return s;
    }

//    @Override
//    public Set<Class<?>> getClasses() {
//        return Collections.emptySet();
//    }
}
