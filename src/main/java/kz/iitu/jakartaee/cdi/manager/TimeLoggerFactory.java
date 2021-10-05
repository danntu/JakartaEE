package kz.iitu.jakartaee.cdi.manager;

import jakarta.enterprise.inject.Produces;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeLoggerFactory {

    @Produces
    public TimeLogger getTimeLogger() {
        return new TimeLogger(new SimpleDateFormat("HH:mm:ss"), Calendar.getInstance());
    }
}
