package com.example.julius.tutorialsession;

import java.util.jar.Attributes;

/**
 * Created by Dell on 6/1/2018.
 */

public class Student {

    private String studName;
    private String studCourse;
    private int studGrade;

    public Student(String studName, String studCourse, int studGrade){

        this.studName = studName;
        this.studCourse = studCourse;
        this.studGrade = studGrade;

    }

    public Student(){

        studName = "";
        studCourse = "";
        studGrade = 0;

    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudCourse() {
        return studCourse;
    }

    public void setStudCourse(String studCourse) {
        this.studCourse = studCourse;
    }

    public int getStudGrade() {
        return studGrade;
    }

    public void setStudGrade(int studGrade) {
        this.studGrade = studGrade;
    }
}
