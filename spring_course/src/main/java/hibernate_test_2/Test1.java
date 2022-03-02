package hibernate_test_2;

import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {  //создание объектов в БД
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Zaur", "Tregulov", "IT", 500);
//            Detail detail = new Detail("Baku", 123456789, "zaurtregulov@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("----------------DONE----------------");


//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Moscow", 987734312, "olejka@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
////            System.out.println("----------------DONE----------------");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("----------------DONE----------------");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
            System.out.println(detail.getEmployee());

            session.getTransaction().commit();
            System.out.println("----------------DONE----------------");
        } finally {
            session.close();
            factory.close();
        }
    }
}
