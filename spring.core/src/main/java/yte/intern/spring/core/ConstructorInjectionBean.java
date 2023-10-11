package yte.intern.spring.core;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {
    public void print(){
        System.out.println("constructor injection");
    }
}
