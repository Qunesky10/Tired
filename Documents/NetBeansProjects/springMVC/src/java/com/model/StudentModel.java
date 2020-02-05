package com.model;

import java.util.ArrayList;
import java.util.Date;

public class StudentModel {
    private String  studentName;
    private String studentLocation;
    private ArrayList<String> studentCourses;

    public ArrayList<String> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(ArrayList<String> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }
    private Date DateOfBirth;

    public void setStudentLocation(String studentLocation) {
        this.studentLocation = studentLocation;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLocation() {
        return studentLocation;
    }

}
