package org.tutorial.Main;
import java.util.HashSet;
import java.util.Set;
 

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.tutorial.HelloWorld.HelloWorldRestResource;
 
public class ResourceLoader extends Application{
 
    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<Class<?>>();
        
        // register root resource
        classes.add(HelloWorldRestResource.class);
        return classes;
    }
}