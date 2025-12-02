package Hibernate_Pratice.Tables;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {

@Id
    int rollNo;
    String SName;
    int sAGE;
   @OneToOne
   private Student_Laptop studentLaptop;
   @ManyToOne
   private Support_worker support_worker;

   @ManyToOne
   private Study_Room studyRoom;

   @ManyToMany
   private List<Teacher>teachers ;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", SName='" + SName + '\'' +
                ", sAGE=" + sAGE +
                ", studentLaptop=" + studentLaptop +
                ", support_worker=" + support_worker;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Study_Room getStudyRoom() {
        return studyRoom;
    }

    public void setStudyRoom(Study_Room studyRoom) {
        this.studyRoom = studyRoom;
    }

    public Support_worker getSupport_worker() {
        return support_worker;
    }

    public void setSupport_worker(Support_worker support_worker) {
        this.support_worker = support_worker;
    }

    public Student_Laptop getStudentLaptop() {
        return studentLaptop;
    }

    public void setStudentLaptop(Student_Laptop studentLaptop) {
        this.studentLaptop = studentLaptop;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public int getsAGE() {
        return sAGE;
    }

    public void setsAGE(int sAGE) {
        this.sAGE = sAGE;
    }


}
