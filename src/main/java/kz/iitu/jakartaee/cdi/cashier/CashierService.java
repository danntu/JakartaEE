package kz.iitu.jakartaee.cdi.cashier;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import kz.iitu.jakartaee.cdi.Cashier;

public class CashierService {
    @Inject
    Event<Cashier> cashierEvent;

    public void addCashier(Cashier cashier){
        System.out.println(cashier.getName()+ " cashier was added");
        cashierEvent.fire(cashier);
    }
}
