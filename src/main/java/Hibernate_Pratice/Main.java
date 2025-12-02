package Hibernate_Pratice;


import Hibernate_Pratice.Mapping.*;
import Hibernate_Pratice.Tables.*;
import Hibernate_Pratice.CRUD_OPERATION.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
  /// session factory               ////
        ///  initialisation of the session factory to explain the creation in basic every session
        ///  sessionfactory can be initialised using a configuration class
        ///  the configuration class needs load a c file from a hibernate.cfg.xml file that will tell setting to run
        /// the configuration will then load all relevent class that can be read to be turned into table.
        /// configuration class need to run a method to intilase the session factory
        SessionFactory sf =new Configuration()
                .addAnnotatedClass(Hibernate_Pratice.Tables.Student.class)
                .addAnnotatedClasses(Hibernate_Pratice.Tables.Student_Laptop.class)
                .addAnnotatedClasses(Hibernate_Pratice.Tables.Support_worker.class)
                .addAnnotatedClasses(Hibernate_Pratice.Tables.Teacher.class)
                .addAnnotatedClasses(Hibernate_Pratice.Tables.Study_Room.class)

                .configure()
                .buildSessionFactory() ;// cfg.buildSessionFactory(); // to initialise a session you need a session factory use once

///  ending of session factory ///


 /// crud operation ///
        ///  creating ///
        add_student_database student_adder = new add_student_database();
        Student create_student = new Student();
        create_student.setRollNo(98);
        create_student.setsAGE(21);
        create_student.setSName("bob");
            //      student_adder.add_new_student(create_student,sf);
        /// end_of_creating ///


        /// updating  ////
             updata_student_data studentData = new updata_student_data();

             Student predate_student = new Student();
             predate_student.setRollNo(98);
             predate_student.setsAGE(21);
             predate_student.setSName("realtime");
             //studentData.updating_select_student(sf,predate_student);

        /// end of updating ///


        /// deleting ////
            deleting_student_data delete_student = new deleting_student_data();

         //    delete_student.delete_student(sf,100);

        /// end of deleting ///

 /// end of CRUD  /////


///mapping    //////



        ///  one to one mapping /////


        Student_Laptop studentLaptop = new Student_Laptop();
        studentLaptop.setBrand("lenovo");
        studentLaptop.setLID(12);
        studentLaptop.setModel("g12");

        Student one_to_one_student = new Student();
        one_to_one_student.setsAGE(21);
        one_to_one_student.setSName("daniel");
        one_to_one_student.setRollNo(12345);
        one_to_one_student.setStudentLaptop(studentLaptop);

        one_to_one_mapping one = new one_to_one_mapping();
     //   one.add_both_laptop_student(studentLaptop,one_to_one_student,sf);


        ///       end of one to one mapping              /////

        ///  one to many mapping ///


     //   one_to_many_mapping.one_to_many_connection(sf);

     //   many_to_one_mapping.mapped(sf);

        /// end to one to many mapping ///




        /// many to many mapping ///

        Many_to_Many_mapping manyToManyMapping = new Many_to_Many_mapping();
        manyToManyMapping.many_many_map(sf);


        /// end many to many mapping ///

      //  student_adder.add_new_student(predate_student.getRollNo(), predate_student.getSName(), predate_student.getsAGE(),sf);
     //  studentData.updating_select_student(sf,updated_student);
      //  student_adder.add_new_student(updated_student.getRollNo(), updated_student.getSName(), updated_student.getsAGE(), sf);



     //   fetching_student_data get_student_data = new fetching_student_data();
     //   get_student_data.get_student_info(sf,100);

    //    student_adder.add_new_student(10,"jhonny",25,sf);






    }
}