package spring_introduction;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Pet pet = context.getBean("cat", Cat.class);
//        pet.say();
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
    }
}
