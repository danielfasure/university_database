package Hibernate_Pratice.CRUD_OPERATION;

import Hibernate_Pratice.Tables.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class fetching_student_data {
 public void   get_student_info(SessionFactory sf,int primarykey){
     Session session = sf.openSession();
     Student target_student = session.get(Student.class, primarykey);
     System.out.println(target_student);


 }
}
