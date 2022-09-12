package com.bridgelabz.springbeanscopesdemo.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private String studentName;
    private String city;

//    public Student() {
//        System.out.println("Object Created Successfully!!");
//    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
