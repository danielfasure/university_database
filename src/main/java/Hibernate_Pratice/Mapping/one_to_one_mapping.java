package Hibernate_Pratice.Mapping;

import Hibernate_Pratice.Tables.Student;
import Hibernate_Pratice.Tables.Student_Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class one_to_one_mapping {
  public void add_both_laptop_student (Student_Laptop slaptop , Student mapped_student, SessionFactory sf){
      Session session  = sf.openSession();
       Transaction transaction = session.beginTransaction();
      session.merge(slaptop);
      session.merge(mapped_student);
      transaction.commit();

      session.close();
    }

}
