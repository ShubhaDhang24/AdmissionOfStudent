package org.example;

import java.util.Objects;

public class Course {
    private String courseName;
    Student student;

    public String getCourseName() {
        return courseName;
    }

    public Student getStudent() {
        return student;
    }

    public Course() {
    }
    public Course(String courseName,Student stud)
    {
        this.courseName=courseName;
        this.student=stud;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", student=" + student +
                '}';
    }

}
