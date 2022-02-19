package aop;

import org.springframework.stereotype.Component;

@Component
public class School {
    public void addNewSchoolar() {
        System.out.println("Принимается новый школьник");
    }

    public void deleteSchoolar() {
        System.out.println("Исключает из школы");
    }
}
