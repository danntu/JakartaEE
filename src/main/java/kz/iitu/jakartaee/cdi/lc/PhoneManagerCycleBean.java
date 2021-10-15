package kz.iitu.jakartaee.cdi.lc;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;


public class PhoneManagerCycleBean {

    String textCons;

    public PhoneManagerCycleBean() {
        this.textCons = "consturctor";
        System.out.println(this.textCons);
    }

    @PostConstruct
    private void postCons(){
        System.out.println("after constructor");
    }

    @AroundInvoke
    private Object aroundMeth(InvocationContext invocationContext) throws Exception {
        System.out.println("Before methods");
        return invocationContext.proceed();
    }

    public int  getPricePhone(){
        System.out.println("getPricePhone");
        return 100;
    }

    public String getModelPhone(){
        System.out.println("getModelPhone");
        return "Samsung";
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("destroy");
    }
}
