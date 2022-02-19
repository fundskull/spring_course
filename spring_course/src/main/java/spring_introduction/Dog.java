package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
//    String name;
    public Dog() {
        System.out.println("Dog's constructor starts");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public void init() {
        System.out.println("class dog init method");
    }
    public void destroy() {
        System.out.println("class dog destroy method");
    }
}
