package kz.iitu.jakartaee.cdi.ejb.local;

import jakarta.ejb.Local;

@Local
public interface LocalInterface {
    String getName();
}
