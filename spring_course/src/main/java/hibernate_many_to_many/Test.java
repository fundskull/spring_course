package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try{
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Zaur", 5);
//            Child child2 = new Child("Masha", 7);
//            Child child3 = new Child("Vasya", 6);
//            section1.addNewChildToSection(child1);
//            section1.addNewChildToSection(child2);
//            section1.addNewChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("--------------DONE--------------");
            //*****************************************************************************************************

//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("VolleyBall");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Igor", 10);
//            child1.addNewSectionToChild(section1);
//            child1.addNewSectionToChild(section2);
//            child1.addNewSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("--------------DONE--------------");
            //*****************************************************************************************************

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            System.out.println("Get section");
//            Child child = session.get(Child.class, 4);
//
//            System.out.println("Section info");
//            System.out.println(child);
//
//            System.out.println("Section child list info");
//            System.out.println(child.getSectionList());
//
//            session.getTransaction().commit();
//            System.out.println("--------------DONE--------------");
            //*****************************************************************************************************

            session = factory.getCurrentSession();
            session.beginTransaction();

            

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
