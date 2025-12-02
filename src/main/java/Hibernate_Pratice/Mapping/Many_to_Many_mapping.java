package Hibernate_Pratice.Mapping;

import Hibernate_Pratice.Tables.Student;
import Hibernate_Pratice.Tables.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Arrays;

public class Many_to_Many_mapping {

  public   static void many_many_map(SessionFactory sessionFactory){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

      Teacher t1 = new Teacher();
      Teacher t2 = new Teacher();
      Teacher t3 = new Teacher();

      t1.setAge(21);
      t1.setName("matthew");
      t1.setSubject("maths");
      t1.setTid(1);

      t2.setAge(29);
      t2.setName("abby");
      t2.setSubject("computer_science");
      t2.setTid(2);

      t3.setAge(37);
      t3.setName("mark");
      t3.setSubject("english");
      t3.setTid(3);


      s1.setsAGE(14);
      s1.setSName("emma");
      s1.setRollNo(1);

      s2.setsAGE(10);
      s2.setSName("johnny");
      s2.setRollNo(2);


      s3.setsAGE(13);
      s3.setSName("ben");
      s3.setRollNo(3);





     s1.setTeachers(Arrays.asList(t1,t2));
        s2.setTeachers(Arrays.asList(t2,t3));
        s3.setTeachers(Arrays.asList(t1,t2,t3));


       // t1.setStuents(Arrays.asList(s1,s3));
     //   t2.setStuents(Arrays.asList(s2,s3));
//t3.setStuents(Arrays.asList(s1,s2,s3));



      session.merge(t1);
      session.merge(t2);
      session.merge(t3);


      session.merge(s1);
      session.merge(s2);
      session.merge(s3);

        transaction.commit();
        session.close();
        session.




    }
}
