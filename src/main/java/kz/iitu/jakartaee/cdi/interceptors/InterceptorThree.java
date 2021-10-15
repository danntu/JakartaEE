package kz.iitu.jakartaee.cdi.interceptors;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

public class InterceptorThree {

    @AroundInvoke
    private Object aroundMeth(InvocationContext invocationContext) throws Exception {
        System.out.println("InterceptorThree");
        return invocationContext.proceed();
    }


}
