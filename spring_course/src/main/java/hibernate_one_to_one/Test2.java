package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {  //создание объектов в БД
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
//            Employee employee = new Employee("Nikolay", "Ivanov", "HR", 850);
//            Detail detail = new Detail("NEw York", 654132122, "nikolay@gmail.com");
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
            session.beginTransaction();
//            session.save(detail);

//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail.getEmployee());

//            Detail detail = session.get(Detail.class, 4);
//            detail.getEmployee().setEmpDetail(null);
//            session.delete(detail);


            session.getTransaction().commit();
            System.out.println("----------------DONE----------------");


        } finally {
            session.close();
            factory.close();
        }
    }
}
