package kz.iitu.jakartaee.cdi.manager;

import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;

@Alternative
//@Default
@PhoneManagerQualifier
public class PhoneManager implements Manager {
    @Override
    public String sellProduct(String product) {
        return "PhoneManager sold " + product;
    }
}
