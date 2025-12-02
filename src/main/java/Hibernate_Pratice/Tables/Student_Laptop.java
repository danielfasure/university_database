package Hibernate_Pratice.Tables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student_Laptop {
    @Id
    private int LID;
    private String brand;
    private String model;
    private int ram;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getLID() {
        return LID;
    }

    public void setLID(int LID) {
        this.LID = LID;
    }

    @Override
    public String toString() {
        return "Student_Laptop{" +
                "LID=" + LID +
                ", brand=" + brand +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
