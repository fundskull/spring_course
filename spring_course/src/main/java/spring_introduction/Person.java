package spring_introduction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component ("personBean")
public class Person {


    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;


//    public Person(Pet pet) {
//        System.out.println("Added Pet to Person with constructor");
//        this.pet = pet;
//    }
//    public Person() {
//        System.out.println("Default constructor");
//    }

//    @Autowired@Qualifier("cat")
    public Person(Pet pet) {
        System.out.println("Person's constructor starts");
            this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }

//    @Autowired
//    @Qualifier("cat")
//    public void setPet(Pet pet) {
//        System.out.println("Added Pet to Person with setter");
//        this.pet = pet;
//    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
