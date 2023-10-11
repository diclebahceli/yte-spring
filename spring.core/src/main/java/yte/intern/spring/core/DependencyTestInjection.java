package yte.intern.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyTestInjection {
    @Autowired
    public FieldInjectionBean fieldInjectionBean;

    public ConstructorInjectionBean constructorInjectionBean;
    public SetterInjectionBean setterInjectionBean;

    @Autowired
    public DependencyTestInjection(ConstructorInjectionBean constructorInjectionBean) {
        this.constructorInjectionBean = constructorInjectionBean;
    }

    @Autowired
    public void setSetterInjectionBean(SetterInjectionBean setterInjectionBean) {
        this.setterInjectionBean = setterInjectionBean;
    }

    public void print() {
        fieldInjectionBean.print();
        constructorInjectionBean.print();
        setterInjectionBean.print();
    }
}
