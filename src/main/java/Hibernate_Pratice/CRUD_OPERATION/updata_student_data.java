package Hibernate_Pratice.CRUD_OPERATION;

import Hibernate_Pratice.Tables.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class updata_student_data {
 public  void   updating_select_student(SessionFactory sf, Student updated_student){


     try {

         Session session = sf.openSession();
         Transaction transcation = session.beginTransaction();
         session.merge(updated_student);
         transcation.commit();
         session.close();
     } catch (Exception e) {

         System.out.println("you have "+ e);
     }








    }
}
