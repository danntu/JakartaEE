package kz.iitu.jakartaee.cdi.specialize;

import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Specializes;


public class TechiqueShop implements Shop{
    @Override
    public String printName() {
       return "TechiqueShop";
    }
}
