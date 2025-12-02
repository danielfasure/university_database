package Hibernate_Pratice.Tables;

import jakarta.persistence.*;

import java.util.List;
@Entity

public class Support_worker {
    @Id
    private int  SID;
    private String name;
    @OneToMany
     List<Student> troubled_ones ;

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public List<Student> getTroubled_ones() {
        return troubled_ones;
    }

    public void setTroubled_ones(List<Student> troubled_ones) {
        this.troubled_ones = troubled_ones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "support_worker{ " +
                "SID=" + SID +
                ", name='" + name + '\'' +
                ", troubled_ones=" + troubled_ones +
                '}';
    }
}
