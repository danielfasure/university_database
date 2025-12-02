package Hibernate_Pratice.Mapping;

import Hibernate_Pratice.Tables.Student;
import Hibernate_Pratice.Tables.Support_worker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Arrays;


public  class  one_to_many_mapping {






    public static void one_to_many_connection(SessionFactory sf){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 =new Student() ;
        Support_worker sw = new Support_worker();

    Session session  = sf.openSession();
    Transaction transaction = session.beginTransaction();
    s1.setsAGE(21);
    s2.setsAGE(22);
    s3.setsAGE(23);

    s1.setSName("shwan");
    s2.setSName("babe");
    s3.setSName("cook");

    s1.setRollNo(1);
    s2.setRollNo(2);
    s3.setRollNo(3);


    sw.setName("gary");
        sw.setSID(1);
        sw.setTroubled_ones(Arrays.asList(s1,s2,s3) );

      session.merge(s1);
        session.merge(s2);
        session.merge(s3);


      session.merge(sw);
      transaction.commit();

        System.out.println(sw);

      session.close();
}
}
