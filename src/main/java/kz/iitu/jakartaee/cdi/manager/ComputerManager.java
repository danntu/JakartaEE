package kz.iitu.jakartaee.cdi.manager;

import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;

@Default
@Named(value = "CompManager")
//@Alternative
@ComputerManagerQualifier
public class ComputerManager implements Manager{
    @Override
    public String sellProduct(String product) {
        return "ComputerManager sold " + product;
    }
}
