package Hibernate_Pratice.CRUD_OPERATION;

import Hibernate_Pratice.Tables.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class remove_student_data {
 public void   student_remover(SessionFactory sf, Student student){
Session session = sf.openSession();
     Transaction transaction = session.beginTransaction();
session.remove(student);
transaction.commit();

session.close();
    }
}
