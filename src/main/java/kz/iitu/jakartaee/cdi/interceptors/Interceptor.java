package kz.iitu.jakartaee.cdi.interceptors;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.interceptor.AroundConstruct;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

public class Interceptor {

    @AroundConstruct
    private void aroundCons(InvocationContext invocationContext) throws Exception {
        System.out.println("before constructor interceptor");
        invocationContext.proceed();
    }

    @PostConstruct
    private void postCons(){
        System.out.println("after constructor interceptor");
    }

    @AroundInvoke
    private Object aroundMeth(InvocationContext invocationContext) throws Exception {
        System.out.println("Before methods interceptor");
        return invocationContext.proceed();
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("destroy interceptor");
    }
}
