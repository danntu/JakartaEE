package kz.iitu.jakartaee.cdi.cashier;

import jakarta.enterprise.event.Observes;
import kz.iitu.jakartaee.cdi.Cashier;

import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.List;


public class CashierSubscriber {
    List<Cashier> list = new ArrayList<>();

    public void add(@Observes Cashier cashier){
        System.out.println(cashier.getName() + " add to list");
        list.add(cashier);
    }
}
