package kz.iitu.jakartaee.cdi.ejb.chain;


import jakarta.annotation.PostConstruct;
import jakarta.ejb.DependsOn;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

@Singleton
@Startup
@DependsOn("SecondBean")
public class FirsrBean {
    @PostConstruct
    void postConstruct(){
        System.out.println("FirsrBean");
    }
}
