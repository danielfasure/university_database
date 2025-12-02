package Hibernate_Pratice.Mapping;

import Hibernate_Pratice.Tables.Student;
import Hibernate_Pratice.Tables.Study_Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Arrays;

public class many_to_one_mapping {



    public static void mapped(SessionFactory sessionFactory){
     Session session = sessionFactory.openSession();
     Transaction tf = session.beginTransaction();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Study_Room studyRoom = new Study_Room();


        s1.setRollNo(1);
        s2.setRollNo(2);
        s3.setRollNo(3);



        s1.setsAGE(19);
        s2.setsAGE(21);
        s3.setsAGE(25);

        studyRoom.setCapcacity(200);
        studyRoom.setRid(14);
        s1.setStudyRoom(studyRoom);
        s2.setStudyRoom(studyRoom);
        s3.setStudyRoom(studyRoom);


     session.merge(studyRoom);
     session.merge(s2);
     session.merge(s3);
     session.merge(s1);

     studyRoom.setStudy_group(Arrays.asList(s1,s2,s3));
     session.merge(studyRoom);
tf.commit();
session.close();
     System.out.println(studyRoom);


    }
}
