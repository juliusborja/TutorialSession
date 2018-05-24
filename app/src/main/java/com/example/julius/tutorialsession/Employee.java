package com.example.julius.tutorialsession;

import java.util.Date;

/**
 * Created by Julius on 07/03/2018.
 */

public class Employee {

    public String name;
    public int age;
    public Date started;
    public float idno;
    public int contact;
    public int salary;
    public int deduction;

    public Employee(){
        salary = 1000;
        deduction = 20;
    }

    public Employee(int salary){
        this.salary = salary;
        deduction = 20;
    }

    public void setDeduction (int deduction) {
        this.deduction = deduction;
    }

    public int getNetIncome (){
        return salary - deduction;
    }

    public void setName (String name){
        this.name = name;
    }

    public void resign() {
    }
    public void start() {}
    public void out() {}

    public String getName(){
        return name;
    }


    private void secretMethod(){



    }

}
