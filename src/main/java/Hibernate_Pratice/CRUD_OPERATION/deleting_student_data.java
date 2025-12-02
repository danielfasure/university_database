package Hibernate_Pratice.CRUD_OPERATION;

import Hibernate_Pratice.Tables.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class deleting_student_data {
  public void  delete_student (SessionFactory sf,int rolln){
      try {
          Session session = sf.openSession();
          Transaction transaction = session.beginTransaction();

          try {
              Student delete_student = session.get(Student.class,rolln);
              session.remove(delete_student);
              transaction.commit();
              session.close();

          }catch (HibernateException e){
              System.out.println("could not get student from ID ALSO HOLD THIS : "+ e);
          }



      }catch (Exception e ){
          System.out.println("you dont have "+ e);
      }

  }
}
