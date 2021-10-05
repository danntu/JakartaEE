package kz.iitu.jakartaee.cdi.manager;

@PhoneManagerQualifier
public class PhoneManager implements Manager {
    @Override
    public String sellProduct(String product) {
        return "PhoneManager sold " + product;
    }
}
