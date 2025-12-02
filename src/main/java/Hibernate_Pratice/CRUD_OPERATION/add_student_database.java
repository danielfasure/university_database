package Hibernate_Pratice.CRUD_OPERATION;

import Hibernate_Pratice.Tables.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class add_student_database {
    public void add_new_student(    Student create_student,SessionFactory SF){




try {
    Session session = SF.openSession();
    session.persist(create_student);
    System.out.println(create_student.getSName() + " has been added to the student table");

    Transaction transaction = session.beginTransaction();
    transaction.commit();


    session.close();
} catch (Exception e) {

    System.out.println("you have"+ e);
}










    }
}
