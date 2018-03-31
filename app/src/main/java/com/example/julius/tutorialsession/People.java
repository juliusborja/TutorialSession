package com.example.julius.tutorialsession;

import java.util.Date;

/**
 * Created by Julius on 26/03/2018.
 */

public class People {

    int age = 25;
    Date birthdate;
    String birthplace = "Manila";
    char firstLetterOfName = 'J';
    float weight = 60.5f;
    float height = 165.25f;

    boolean isValid = false;

    public void talkLoud(){}
    public void jumpHigh(){}
    public void addNumbers(){}

    public void someActions(){

        int x = 5;
        int y = 6;
        int z;

        z = x + y;
        z = x - y;
        //z = 6%5;
        z = z + x;

        String newString = birthplace;

        newString = birthplace.substring(0); //Manila
        newString = birthplace.substring(3); //ila
        newString = birthplace.substring(2,4);//nil


        z = add(7,8); //15
        z = someArithmetics(4,6,8); //-22


        z = someArithmetics(3,6, add(3,4)); //63

    }

    public int add(int a, int b){

        int sum = a + b;

        return sum;
    }

    public int someArithmetics(int a, int b, int c){

        int answer = add(a,b) * c;

        return answer;
    }



}
