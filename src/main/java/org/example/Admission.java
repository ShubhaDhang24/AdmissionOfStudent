package org.example;

import java.time.LocalDate;

public class Admission {
    private String id;
    private LocalDate admissionDate;
    Course course;
    Student student;


    public Student getStudent() {
        return student;
    }

    public String getId() {
        return id;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public Course getCourse() {
        return course;
    }

    public Admission(String id, LocalDate admissionDate, Course course) {
        this.id = id;
        this.admissionDate = admissionDate;
        this.course=course;
    }
    public void printDetails()
    {
        System.out.println("Admission details :"+admissionDate + "   id : "+ getId() +  "  Course "+getCourse());
    }


   /* public String toString() {
        return "Admission{" +
                "id='" + id + '\'' +
                ", admissionDate=" + admissionDate +
                ", course =" + course +
                '}';*/
    }


