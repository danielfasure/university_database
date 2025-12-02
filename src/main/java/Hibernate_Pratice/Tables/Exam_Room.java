package Hibernate_Pratice.Tables;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Exam_Room {
    @Id
    private int rID;
    @OneToOne
    @JoinColumn(name = "teacher_tid")
    private Teacher teacher;

    @ManyToOne
    private List<Student> student ;


    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Exam_Room{" +
                "rID=" + rID +
                ", teacher= " + teacher +
                ", student= " + student +
                '}';
    }
}
