package yte.intern.spring.core;

import org.springframework.stereotype.Component;

@Component
public class FieldInjectionBean {
    public void print(){
        System.out.println("field injection");
    }
}
