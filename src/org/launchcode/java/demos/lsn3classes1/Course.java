package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private int numCredits;
    private ArrayList<Student> students;
    public Course(String courseName, int courseCredits, ArrayList<Student> students) {
        this.courseName = courseName;
        this.numCredits = numCredits;
        this.students = students;
    }
}
