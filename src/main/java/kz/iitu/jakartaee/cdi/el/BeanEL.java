package kz.iitu.jakartaee.cdi.el;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@RequestScoped
@Named("test")
public class BeanEL {
    private String name = "Danik";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
