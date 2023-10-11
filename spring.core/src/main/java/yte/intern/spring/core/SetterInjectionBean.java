package yte.intern.spring.core;

import org.springframework.stereotype.Component;

@Component
public class SetterInjectionBean {
    public void print(){
        System.out.println("setter injection");
    }
}
