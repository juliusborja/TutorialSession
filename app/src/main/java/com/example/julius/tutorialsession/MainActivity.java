package com.example.julius.tutorialsession;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText empName1;
    EditText empName2;
    EditText empName3;

    EditText empSalary1;
    EditText empSalary2;
    EditText empSalary3;

    EditText empDeduction1;
    EditText empDeduction2;
    EditText empDeduction3;

    TextView salEval1;
    TextView salEval2;
    TextView salEval3;

    Button computeBtn;

    EditText studName1;
    EditText studName2;
    EditText studName3;
    
    EditText studCourse1;
    EditText studCourse2;
    EditText studCourse3;
    
    EditText studGrade1;
    EditText studGrade2;
    EditText studGrade3;
    
    TextView GradeEval1;
    TextView GradeEval2;
    TextView GradeEval3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student);
        
        studName1 = findViewById(R.id.studName1);
        studName2 = findViewById(R.id.studName2);
        studName3 = findViewById(R.id.studName3);

        studCourse1 = findViewById(R.id.studCourse1);
        studCourse2 = findViewById(R.id.studCourse2);
        studCourse3 = findViewById(R.id.studCourse3);

        studGrade1 = findViewById(R.id.studGrade1);
        studGrade2 = findViewById(R.id.studGrade2);
        studGrade3 = findViewById(R.id.studGrade3);

        GradeEval1 = findViewById(R.id.GradeEval1);
        GradeEval2 = findViewById(R.id.GradeEval2);
        GradeEval3 = findViewById(R.id.GradeEval3);

        computeBtn = findViewById(R.id.computeBtn);

        computeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int grade1 = 0;

                try {
                    grade1 = Integer.parseInt(studGrade1.getText().toString());
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_LONG).show();
                }

                if(grade1<75){
                    GradeEval1.setText("F");
                }else if(grade1<79){
                    GradeEval1.setText("E");
                }else if(grade1<85) {
                    GradeEval1.setText("D");
                }else if(grade1<89) {
                    GradeEval1.setText("C");
                }else if(grade1<94) {
                    GradeEval1.setText("B");
                }else{
                    GradeEval1.setText("A");
                }

                int grade2 = 0;

                try {
                    grade2 = Integer.parseInt(studGrade2.getText().toString());
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_LONG).show();
                }

                if(grade2<75){
                    GradeEval2.setText("F");
                }else if(grade2<79){
                    GradeEval2.setText("E");
                }else if(grade2<85) {
                    GradeEval2.setText("D");
                }else if(grade2<89) {
                    GradeEval2.setText("C");
                }else if(grade2<94) {
                    GradeEval2.setText("B");
                }else{
                    GradeEval2.setText("A");
                }

                int grade3 = 0;

                try {
                    grade3 = Integer.parseInt(studGrade3.getText().toString());
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_LONG).show();
                }

                if(grade3<75){
                    GradeEval3.setText("F");
                }else if(grade3<79){
                    GradeEval3.setText("E");
                }else if(grade3<85) {
                    GradeEval3.setText("D");
                }else if(grade3<89) {
                    GradeEval3.setText("C");
                }else if(grade3<94) {
                    GradeEval3.setText("B");
                }else{
                    GradeEval3.setText("A");
                }
            }
        });

    }

    public void loadEmployee() {
        empName1 = findViewById(R.id.empName1);
        empName2 = findViewById(R.id.empName2);
        empName3 = findViewById(R.id.empName3);

        empSalary1 = findViewById(R.id.empSalary1);
        empSalary2 = findViewById(R.id.empSalary2);
        empSalary3 = findViewById(R.id.empSalary3);

        empDeduction1 = findViewById(R.id.empDeduction1);
        empDeduction2 = findViewById(R.id.empDeduction2);
        empDeduction3 = findViewById(R.id.empDeduction3);

        salEval1 = findViewById(R.id.salaryEval1);
        salEval2 = findViewById(R.id.salaryEval2);
        salEval3 = findViewById(R.id.salaryEval3);

        computeBtn = findViewById(R.id.computeBtn);

        computeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "";

                String name1 = empName1.getText().toString();
                float sal1 = 0;
                float ded1 = 0;
                boolean emp1Valid = false;

                try {
                    sal1 = Float.parseFloat(empSalary1.getText().toString());
                    ded1 = Float.parseFloat(empDeduction1.getText().toString());

                    emp1Valid = true;
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Invalid Inputs!!!", Toast.LENGTH_LONG).show();
                }

                if (emp1Valid) {
                    Toast.makeText(MainActivity.this, message + (sal1 - ded1), Toast.LENGTH_LONG).show();
                }

                if (sal1 < 1000) {
                    salEval1.setText("Under Paid");
                } else if (sal1 == 1000) {
                    salEval1.setText("Ok");
                } else {
                    salEval1.setText("Over Paid");
                }

            }
        });
    }
    
}