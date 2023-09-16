package org.example;

import java.time.LocalDate;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        Student student1=new Student("Shubha","Dhang", "10");
        Course course1=new Course("Java",student1);

        Student student2=new Student("Negar","Bergamand","11");
        Course course2=new Course("Java",student2);



        Admission admission=new Admission("1001", LocalDate.now(),course1);
        admission.printDetails();

    }

}