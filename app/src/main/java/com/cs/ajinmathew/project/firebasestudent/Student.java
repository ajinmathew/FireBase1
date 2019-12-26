package com.cs.ajinmathew.project.firebasestudent;

public class Student {
    String name;
    int roll_no;
    int admission_no;
    String college;

    public Student(String name, int roll_no, int admission_no, String college) {
        this.name = name;
        this.roll_no = roll_no;
        this.admission_no = admission_no;
        this.college = college;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getAdmission_no() {
        return admission_no;
    }

    public void setAdmission_no(int admission_no) {
        this.admission_no = admission_no;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
