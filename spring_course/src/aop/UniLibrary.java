package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Берем книгу из UniLibrary");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("Возвращаем книгу в UniLibrary");
        return "Война и мир";
    }

    public void getMagazine() {
        System.out.println("Берем журнал из UniLibrary");
        System.out.println("____________________________");
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал в UniLibrary");
        System.out.println("____________________________");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Добавляем книгу в UniLibrary");
        System.out.println("____________________________");
    }

    public void addMagazine() {
        System.out.println("Добавляем журнал в UniLibrary");
        System.out.println("____________________________");
    }
}
