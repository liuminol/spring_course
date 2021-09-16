package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Берем книгу из UniLibrary");
    }

    public String returnBook() {
        System.out.println("Возвращаем книгу в UniLibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("Берем журнал из UniLibrary");
    }
}
