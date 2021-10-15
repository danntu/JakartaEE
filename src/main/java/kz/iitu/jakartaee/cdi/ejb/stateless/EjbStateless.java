package kz.iitu.jakartaee.cdi.ejb.stateless;

import jakarta.ejb.Singleton;
import jakarta.ejb.Stateful;
import jakarta.ejb.StatefulTimeout;
import jakarta.ejb.Stateless;

@Stateless
//@Singleton
//@Stateful
//@StatefulTimeout(1)
public class EjbStateless {
    private int i = 5;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
