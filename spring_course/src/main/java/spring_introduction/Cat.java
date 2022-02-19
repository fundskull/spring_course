package spring_introduction;

import org.springframework.stereotype.Component;

//@Component
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat's constructor starts");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
