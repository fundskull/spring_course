package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HomeTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HomeConfigClass.class);
        School school = context.getBean("school", School.class);
        school.addNewSchoolar();

        context.close();
    }
}
