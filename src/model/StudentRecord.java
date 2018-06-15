package model;

import java.io.Serializable;

public class StudentRecord implements Serializable {
    public Student thisstudent=null;
    public Statistics thisstatistics=null;
    public StudentRecord(Student std, Statistics statistics){
        this.thisstudent = std;
        this.thisstatistics = statistics;
    }
}
