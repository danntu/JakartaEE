package kz.iitu.jakartaee.cdi.specialize;

import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Specializes;

//@Alternative
@Specializes
public class ComputerShop extends TechiqueShop{
    @Override
    public String printName() {
        return  "ComputerShop";
    }
}
