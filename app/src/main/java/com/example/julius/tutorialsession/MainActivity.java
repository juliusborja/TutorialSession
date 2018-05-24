package com.example.julius.tutorialsession;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView title;
    Button addSalary;
    Button next;
    EditText text1;
    EditText text2;

    Computer computer;
    Employee employee1;
    Employee employee2;
    Employee employee3;

    List<Employee> employees;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        computer = new Computer();

        title = findViewById(R.id.title);
        addSalary = findViewById(R.id.prev);
        next = findViewById(R.id.next);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

        employee1 = new Employee();
        employee2 = new Employee(10);
        employee3 = new Employee();

        employees = new ArrayList();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        int ded = 500;
        int total = 0;

        String message = "";


        for(int counter = 0; counter<employees.size(); counter++){
            Employee tempEmployee = employees.get(counter);
            tempEmployee.setDeduction(ded+counter);
            tempEmployee.setName("employee" + (counter+1));

            message = message + "Employee: " + tempEmployee.name + "\n";
            message = message + "Salary: " + tempEmployee.salary + "\n";
            message = message + "Deduction: " + tempEmployee.deduction + "\n\n";

            total+=tempEmployee.getNetIncome();
        }

        message = message + "Total Net Income of All Employees: " + total;

        final String finalMessage = message;
        addSalary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int eIncome1 = employee1.getNetIncome();
                int eIncome2 = employee2.getNetIncome();

                Toast.makeText(MainActivity.this, finalMessage, Toast.LENGTH_LONG).show();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float x = convertToFloat(text1);
                float y = convertToFloat(text2);

                Toast.makeText(MainActivity.this,  "The sum is " + computer.add(x, y), Toast.LENGTH_LONG).show();
            }
        });

    }



    public float convertToFloat(EditText input){

        String val = input.getText().toString();

        float num = Float.parseFloat(val);

        return num;

    }



    public void goToNext(){

        Toast.makeText(MainActivity.this, "Going to Previous Screen", Toast.LENGTH_LONG).show();
    }


    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.editText);
        text = findViewById(R.id.text);
        text2 = findViewById(R.id.text2);

        b1= (Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputValue = input.getText().toString();
                int convVal = Integer.parseInt(inputValue);

                String inputValue2 = text2.getText().toString();
                int convVal2 = Integer.parseInt(inputValue2);

                //Toast.makeText(MainActivity.this, convVal + "-" + convVal2, Toast.LENGTH_LONG).show();

                text.setText(add(convVal, convVal2) + "");

            }
        });





        input.setVisibility(View.INVISIBLE);
        input.setVisibility(View.VISIBLE);
        input.setVisibility(View.GONE);



        Toast.makeText(this, "Hello there again!", Toast.LENGTH_LONG).show();


        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Alert Dialog");
        alertDialog.setMessage("Welcome user!");

        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.setButton("NYE", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "You clicked on NYE", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.show();

    }


    public void tutorial(){

        name = "hello world";

        int nameLength = name.length();
        char charAtFive = name.charAt(5);

        name = name.toUpperCase();
        name = name.toLowerCase();

        Person person1 = new Person();
        Person person2 = new Person();

        person1.smoke();


    }


    public void employeeAction(){

        Employee employee1 = new Employee();
        employee1.resign();

        Employee employee2 = new Employee();

        employee1.setName("Julius");
        employee1.getName();

        employee2.setName("Yumi");

    }

    public void doCalculation(){

        int x = 2;
        int y = 5;
        int total = add(x,y);

        total = sub(5, add(total,add(25, sub(22, 6))) );

    }

    public void doCalculation(int x){



    }


    public String overloadingExample(int x){

        if(x==1) {
            doCalculation();
        }else if(x==7){
            doCalculation(1);
        }else{
            //some Code
        }

        String output = "";
        String output2 = "";
/*
        switch(x){
            case 1:
                output = "one";
                break;
            case 2:
                output = "two";
                break;
            case 7:
                output = "seven";
                break;
            default:
                output = "some number";
        }

        if(x==1) {
            output = "one";
        }
        else if (x==2) {
            output = "two";
        }
        else if(x==7) {
            output="seven";
        }
        else{
            output = "some number";
        }
        return output;


    }






    public char doSomething(){
        return 'a';
    }


    public int add(int x, int y){
        int sum = x + y;

        return sum;
    }

    public int sub(int x, int y) {
        int dif = x -y;

        return dif;
    }

*/


}