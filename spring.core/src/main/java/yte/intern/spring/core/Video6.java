package yte.intern.spring.core;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Video6 {

    public Video6(){
        System.out.println("Video6 constructor");
    }

    // @PostConstruct
    // public void init(){
    //     System.out.println("Video6 init");
    // }

    // @PreDestroy
    // public void destroy(){
    //     System.out.println("Video6 destroy");
    // }

    public void print(){
        System.out.println("Video6 print");
     }
    
}
