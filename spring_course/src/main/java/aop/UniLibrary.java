package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends  AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берём книгу из библиотеки университета ");
        System.out.println("------------------------------------------------");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу");
        System.out.println("------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Мы берём журнал из библиотеки университета");
        System.out.println("------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в библиотеку университета");
        System.out.println("------------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книгу в библиотеку университета");
        System.out.println("------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем книгу из библиотеку университета");
        System.out.println("------------------------------------------------");
    }


}
