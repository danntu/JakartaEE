package kz.iitu.jakartaee.cdi.interceptors;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InterceptorBinding;
import jakarta.interceptor.InvocationContext;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@InterceptorBinding
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface  Four {}

@Four
@Interceptor
public class InterceptorFour {

    @AroundInvoke
    private Object aroundMeth(InvocationContext invocationContext) throws Exception {
        System.out.println("InterceptorFour");
        return invocationContext.proceed();
    }


}
