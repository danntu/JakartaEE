package kz.iitu.jakartaee.cdi.manager;

@ComputerManagerQualifier
public class ComputerManager implements Manager{
    @Override
    public String sellProduct(String product) {
        return "ComputerManager sold " + product;
    }
}
