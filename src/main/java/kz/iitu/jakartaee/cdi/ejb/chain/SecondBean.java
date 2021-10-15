package kz.iitu.jakartaee.cdi.ejb.chain;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;

@Singleton
public class SecondBean {
    @PostConstruct
    void postConstruct(){
        System.out.println("SecondBean");
    }
}
