package Hibernate_Pratice.Tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity(name = "teacher")
public class Teacher {
@Id
    int tid;
@Column(name ="teacher_age")
    int age;
@Column(name = "teacher_main_subject")
    String subject;
@Column(name = "teacher_name")
    String name;
@ManyToMany(mappedBy = "teachers")
List<Student>stuents ;

    public List<Student> getStuents() {
        return stuents;
    }

    public void setStuents(List<Student> stuents) {
        this.stuents = stuents;
    }

    public Integer getTID(){
        return  tid;
    }
    public void setTid(int tid){
        this.tid = tid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{ " +
                "age= " + age +
                ", subject= '" + subject + '\'' +
                ", name=' " + name + '\'' +
                '}';
    }

}
