import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Dog;
import spring_introduction.Person;
import spring_introduction.Pet;

public class Test777 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Pet pet = context.getBean("dogBean", Dog.class);
//        pet.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
    }
}
