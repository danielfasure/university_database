package Hibernate_Pratice.Tables;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Study_Room {
  @Id

  int rid;
  String rname;
  int capcacity;
  @OneToMany(mappedBy = "studyRoom")
  private List<Student> study_group;

  public List<Student> getStudy_group() {
    return study_group;
  }

  public void setStudy_group(List<Student> study_group) {
    this.study_group = study_group;
  }

  public int getRid() {
    return rid;
  }

  public void  setRid(int rid) {
    this.rid= rid;
  }

  public String getRname() {
    return rname;
  }

  public void setRname(String rname) {
    this.rname = rname;
  }

  public int getCapcacity() {
    return capcacity;
  }

  public void setCapcacity(int capcacity) {
    this.capcacity = capcacity;
  }

  @Override
  public String toString() {
      return "Study_Room{ " +
            "rid= " + rid +
            ", rname=' " + rname + '\'' +
            ", room capcacity=" + capcacity +
            ", study_group members size is  " + study_group.size() +
            '}';

  }
}
