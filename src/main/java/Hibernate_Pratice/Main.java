package Hibernate_Pratice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        Student s1 = new Student();
        s1.setsAGE(23);
        s1.setRollNo(101);
        s1.setSName("nam");
        System.out.println(s1);
        Configuration cfg = new Configuration();
        cfg.configure();

        cfg.addAnnotatedClass(Hibernate_Pratice.Student.class);

        SessionFactory sf = cfg.buildSessionFactory(); // to initialise you need to configure your factory with configure class



      Session session = sf.openSession() ; // the session factory is used to begin session;

        //session.save(s1);

        //  Configuration c1 = new Configuration();
//    SessionFactory f1 =
    }
}