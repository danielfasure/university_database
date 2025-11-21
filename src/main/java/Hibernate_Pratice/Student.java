package Hibernate_Pratice;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {

@Id
    int rollNo;
    String SName;
    int sAGE;

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

    @Override
    public String toString() {
        return
                 rollNo +
                        "belong to " + SName + '\'' +
                        " age:" + sAGE ;
    }

    Student(){


    }
}
