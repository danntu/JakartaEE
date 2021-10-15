package kz.iitu.jakartaee.cdi.ejb.local;

import jakarta.ejb.Local;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

@Stateless
@LocalBean
//@Local(LocalInterface.class)
public class ExampleBean implements LocalInterface{
    @Override
    public String getName() {
        return "ExampleBean";
    }
    public String getAnotherName(){
        return "ExampleBeanAnother";
    }
}
