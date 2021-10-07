package kz.iitu.jakartaee.cdi.openwebbean;

import javax.enterprise.inject.spi.Bean;
import jakarta.inject.Inject;
import org.apache.webbeans.config.WebBeansContext;
import org.apache.webbeans.spi.ContainerLifecycle;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.inject.spi.BeanManager;

public class Starter {

    @Inject
    Hello hello;

//    public static void main(String[] args) {
//        ContainerLifecycle lifecycle  =
//                WebBeansContext.currentInstance().getService(ContainerLifecycle.class);
//        lifecycle.startApplication(null);
//        BeanManager beanManager = lifecycle.getBeanManager();
//        Bean<?> bean = beanManager.getBeans("hello").iterator().next();
//        Hello hello = (Hello)lifecycle.getBeanManager()
//                .getReference(bean, Hello.class, beanManager.createCreationalContext(bean));
//        hello.greeting("Danik");
//
//        lifecycle.stopApplication(null);
//    }

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        Hello hello = container.select(Hello.class).get();
        hello.greeting("Danik");
        container.shutdown();
    }
}

