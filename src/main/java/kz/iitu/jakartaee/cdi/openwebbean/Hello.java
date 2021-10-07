package kz.iitu.jakartaee.cdi.openwebbean;

import jakarta.inject.Named;

@Named
public class Hello {
    public void greeting(String name){
        System.out.println("Hello " + name);
    }
}
