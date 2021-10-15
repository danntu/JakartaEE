package kz.iitu.jakartaee.cdi.interceptors;

import jakarta.enterprise.context.RequestScoped;

import jakarta.interceptor.ExcludeClassInterceptors;
import jakarta.interceptor.Interceptors;

@RequestScoped
@Interceptors(Interceptor.class)
public class PhoneManagerCycleBeanInterceptor {

    public PhoneManagerCycleBeanInterceptor() {
        System.out.println("constructor");
    }

    //@Interceptors(Interceptor.class)
    public int  getPricePhone(){
        System.out.println("getPricePhone");
        return 100;
    }

    @ExcludeClassInterceptors
    public String getModelPhone(){
        System.out.println("getModelPhone");
        return "Samsung";
    }

}
