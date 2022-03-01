package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test5 { //изменение объектов в БД
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee1 = session.get(Employee.class, 5);
//            session.delete(employee1);

//            List<Employee> empList = session.createQuery("from Employee where name = 'Aleksandr'").getResultList();
//            for (Employee e : empList) {
//                session.delete(e);
//            }

            session.createQuery("delete Employee " +
                    "where name = 'Aleksandr'").executeUpdate();

            session.getTransaction().commit();


            System.out.println("----------------DONE----------------");
        } finally {
            factory.close();
        }
    }
}
