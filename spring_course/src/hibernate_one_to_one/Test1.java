package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Name", "Surname", "IT", 800);
//            Detail detail = new Detail("City", "456465", "mail");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Name2", "Surname2", "Sales", 700);
//            Detail detail = new Detail("City2", "40565", "gmail");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done");

        } finally {
            session.close();
            factory.close();
        }
    }
}
