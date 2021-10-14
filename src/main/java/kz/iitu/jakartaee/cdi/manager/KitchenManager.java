package kz.iitu.jakartaee.cdi.manager;

//@Default
//@Named(value = "CompManager")
//@Alternative
@KitchenManagerQualifier
public class KitchenManager implements Manager{
    @Override
    public String sellProduct(String product) {
        return "Kitchen sold " + product;
    }
}
