package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Department dep = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("Art", "Tyu", 800);
//            Employee emp2 = new Employee("Rob", "Star", 1000);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee emp = session.get(Employee.class, 2);
//
//            System.out.println(emp);
//            System.out.println(emp.getDepartment());
//
//            session.getTransaction().commit();
//

            session = factory.getCurrentSession();
            Employee emp = session.get(Employee.class, 1);
            session.beginTransaction();

            session.delete(emp);

            session.getTransaction().commit();

            System.out.println("Done");

        } finally {
            session.close();
            factory.close();
        }
    }
}
