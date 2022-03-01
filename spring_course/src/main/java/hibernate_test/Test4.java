package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 { //изменение объектов в БД
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee1 = session.get(Employee.class, 1);
//            employee1.setSalary(1500);
//            System.out.println(employee1);
//
//            List<Employee> empList = session.createQuery("from Employee where name = 'Aleksandr'").getResultList();
//            for (Employee e : empList) {
//                e.setSalary(1100);
//            }

            session.createQuery("update Employee set salary = 1000 where name = 'Aleksandr'").executeUpdate();

            session.getTransaction().commit();


            System.out.println("----------------DONE----------------");
        } finally {
            factory.close();
        }
    }
}
