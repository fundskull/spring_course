package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println("First person's age is: " + person.getAge());
        System.out.println("First person's surname is : " + person.getSurname());
//
//        Person person2 = context.getBean("myPerson2", Person.class);
//        person2.callYourPet();
//
//        System.out.println("Second person's age is: " + person2.getAge());
//        System.out.println("Second person's surname is : " + person2.getSurname());


        context.close();
    }
}
