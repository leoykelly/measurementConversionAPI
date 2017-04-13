package edu.matc;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kvang on 4/13/17.
 */
@ApplicationPath("/")
public class ConverterApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet hashSet = new HashSet<Class<?>>();
        hashSet.add(JsonConversion.class);
        return hashSet;
    }
}
