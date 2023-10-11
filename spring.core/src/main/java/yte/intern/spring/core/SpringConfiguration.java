package yte.intern.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Bean
    public BeanTest beanTest() {
        return new BeanTest();
    }

    
}
