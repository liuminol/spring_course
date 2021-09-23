package hibrenate_test;

import hibrenate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            /*update for single row*/
//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(1000);

            /*update for several row*/
            session.createQuery("" +
                    "UPDATE Employee " +
                    "SET Salary = 1500 " +
                    "WHERE name = 'C'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done");
        } finally {
            factory.close();
        }
    }
}
