package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    @PostConstruct
    protected void init() {
        System.out.println("Class Dog: init method");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
