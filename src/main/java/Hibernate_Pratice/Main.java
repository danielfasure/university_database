package Hibernate_Pratice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {



        Student s1 = new Student();
        s1.setsAGE(23);
        s1.setRollNo(110);
        s1.setSName("Pam");


        System.out.println(s1);



        //Configuration cfg = new Configuration();
      //  cfg.configure(); //load an xml file with the hibernate connection setting
     //  cfg.addAnnotatedClass(Hibernate_Pratice.Student.class);


        SessionFactory sf =new Configuration()
                .addAnnotatedClass(Hibernate_Pratice.Student.class)
                .configure()
                .buildSessionFactory() ;// cfg.buildSessionFactory(); // to initialise a session you need a session factory use once

      Session session = sf.openSession() ; // hibernate need session to talk to database

        Transaction transaction = session.beginTransaction();
      session.persist(s1);
        transaction.commit();


        Student S2 = session.getReference(Student.class,102);
        System.out.println(S2);


        session.close();
        sf.close();
    }
}