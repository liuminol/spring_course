package io.github.liuminol.spring.rest_client;

import io.github.liuminol.spring.rest_client.configuration.MyConfig;
import io.github.liuminol.spring.rest_client.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int id = 1;

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();
        Employee employee = communication.getEmployee(id);

        System.out.println("All employees");
        System.out.println(allEmployees);
        printBorder();

        System.out.println("Get employee by id = " + id);
        System.out.println(employee);
        printBorder();
    }

    private static void printBorder() {
        String border = "_______________________________";
        System.out.println(border);
    }
}
