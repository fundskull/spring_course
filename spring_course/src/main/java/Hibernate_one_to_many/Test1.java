package Hibernate_one_to_many;

import Hibernate_one_to_many.entity.Department;
import Hibernate_one_to_many.entity.Employee;
import com.sun.istack.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {  //создание объектов в БД
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
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

//            session = factory.getCurrentSession();
//            Department department = new Department("Sales", 800, 1500);
//            Employee employee1 = new Employee("Zaur", "Tregulov", 800);
//            Employee employee2 = new Employee("Elena", "Smirnova", 1500);
//            Employee employee3 = new Employee("Anton", "Smirnov", 1200);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//            session.beginTransaction();
//            session.save(department);

            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("Get Department");
            Department department = session.get(Department.class, 4);
            System.out.println("Show Department");
            System.out.println(department);
            System.out.println("Show emps of the department");
            System.out.println(department.getEmployeeList());
            System.out.println("---------------");
            System.out.println("DONE");

//            session = factory.getCurrentSession();
//
//
//
//            session.beginTransaction();
//            Department department = session.get(Department.class, 2);
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());
//            Detail detail = session.get(Detail.class, 1);
//            System.out.println(detail.getEmployee());

//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);


            session.getTransaction().commit();
            System.out.println("----------------DONE----------------");
        } finally {
            session.close();
            factory.close();
        }
    }
}
