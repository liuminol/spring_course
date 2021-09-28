package hibernate_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("football");
//            Child child1 = new Child("Mike", 5);
//            Child child2 = new Child("Paul", 4);
//            Child child3 = new Child("Alice", 6);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
            //********************************
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("volleyball");
//            Section section2 = new Section("chess");
//            Section section3 = new Section("math");
//
//            Child child1 = new Child("Igor", 10);
//            child1.addSection(section1);
//            child1.addSection(section2);
//            child1.addSection(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
            //********************************

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 10);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//********************************

            session = factory.getCurrentSession();

            session.beginTransaction();

            Child child = session.get(Child.class, 11);
            session.delete(child);

            session.getTransaction().commit();

            System.out.println("Done");
        } finally {
            session.close();
            factory.close();
        }
    }
}
