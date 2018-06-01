package com.example.julius.tutorialsession;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

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

    List<Student> studentList;
    List<EditText> studentNamesEditTextList;
    List<EditText> studentCourseEditTextList;
    List<EditText> studentGradeEditTextList;
    List<TextView> studentEvalTextViewList;

    LinearLayout studentContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //use student.xml
//        setContentView(R.layout.student);
//        loadStudentOneByOne();

        //use student_list.xml
//        setContentView(R.layout.student_list);
//        loadDynamicStudentList();

        //use activity_main.xml
        setContentView(R.layout.activity_main);
        loadEmployee();

    }

    public void loadDynamicStudentList(){

        //Generate UI
        studentContainer = findViewById(R.id.studentContainer);

        Button btn = new Button(MainActivity.this);
        btn.setText("Compute");

        Button addBtn = new Button(MainActivity.this);
        addBtn.setText("Add Student");

        studentContainer.addView(btn);
        studentContainer.addView(addBtn);

        studentList = new ArrayList<>();
        studentNamesEditTextList = new ArrayList<>();
        studentCourseEditTextList = new ArrayList<>();
        studentGradeEditTextList = new ArrayList<>();
        studentEvalTextViewList = new ArrayList<>();

        for(int counter = 0; counter<3; counter++){

            EditText nameEditText = new EditText(MainActivity.this);
            EditText courseEditText = new EditText(MainActivity.this);
            EditText gradeEditText = new EditText(MainActivity.this);
            TextView evalTextView = new TextView(MainActivity.this);

            nameEditText.setText("student" + counter);

            studentContainer.addView(nameEditText);
            studentContainer.addView(courseEditText);
            studentContainer.addView(gradeEditText);
            studentContainer.addView(evalTextView);

            studentNamesEditTextList.add(nameEditText);
            studentCourseEditTextList.add(courseEditText);
            studentGradeEditTextList.add(gradeEditText);
            studentEvalTextViewList.add(evalTextView);

        }

        //Set Button Action
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //store students in studentList
                for(int counter=0; counter<studentNamesEditTextList.size(); counter++){
                    studentList = new ArrayList<>();

                    Student student = new Student();
                    student.setStudName(studentNamesEditTextList.get(counter).getText().toString());
                    student.setStudCourse(studentCourseEditTextList.get(counter).getText().toString());
                    try {
                        student.setStudGrade(Integer.parseInt(studentGradeEditTextList.get(counter).getText().toString()));
                    }catch(Exception e){

                    }
                    studentList.add(student);
                }

                //do Evaluation
                int total = 0;
                for(int counter=0; counter<studentList.size(); counter++){

                    int grade = studentList.get(counter).getStudGrade();

                    if(grade<75){
                        studentEvalTextViewList.get(counter).setText("F");
                    }else if(grade<79){
                        studentEvalTextViewList.get(counter).setText("E");
                    }else if(grade<85) {
                        studentEvalTextViewList.get(counter).setText("D");
                    }else if(grade<89) {
                        studentEvalTextViewList.get(counter).setText("C");
                    }else if(grade<94) {
                        studentEvalTextViewList.get(counter).setText("B");
                    }else{
                        studentEvalTextViewList.get(counter).setText("A");
                    }

                    total+=grade;

                }

                //show Average
                Toast.makeText(MainActivity.this, "Average: " + (total/studentList.size()), Toast.LENGTH_LONG).show();
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText nameEditText = new EditText(MainActivity.this);
                EditText courseEditText = new EditText(MainActivity.this);
                EditText gradeEditText = new EditText(MainActivity.this);
                TextView evalTextView = new TextView(MainActivity.this);

                nameEditText.setText("student" + studentNamesEditTextList.size());

                studentContainer.addView(nameEditText);
                studentContainer.addView(courseEditText);
                studentContainer.addView(gradeEditText);
                studentContainer.addView(evalTextView);

                studentNamesEditTextList.add(nameEditText);
                studentCourseEditTextList.add(courseEditText);
                studentGradeEditTextList.add(gradeEditText);
                studentEvalTextViewList.add(evalTextView);

            }
        });
    }

    public void loadStudentOneByOne(){
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

        studentList = new ArrayList();
        studentNamesEditTextList = new ArrayList();
        studentCourseEditTextList = new ArrayList<>();
        studentGradeEditTextList = new ArrayList<>();
        studentEvalTextViewList = new ArrayList<>();

        studentNamesEditTextList.add(studName1);
        studentNamesEditTextList.add(studName2);
        studentNamesEditTextList.add(studName3);

        studentCourseEditTextList.add(studCourse1);
        studentCourseEditTextList.add(studCourse2);
        studentCourseEditTextList.add(studCourse3);

        studentGradeEditTextList.add(studGrade1);
        studentGradeEditTextList.add(studGrade2);
        studentGradeEditTextList.add(studGrade3);

        studentEvalTextViewList.add(GradeEval1);
        studentEvalTextViewList.add(GradeEval2);
        studentEvalTextViewList.add(GradeEval3);

        computeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int counter = 0; counter<3; counter++){
                    Student student = new Student();

                    student.setStudName(studentNamesEditTextList.get(counter).getText().toString());
                    student.setStudCourse(studentCourseEditTextList.get(counter).getText().toString());

                    try {
                        student.setStudGrade(Integer.parseInt(studentGradeEditTextList.get(counter).getText().toString()));
                    }catch(Exception e) {

                    }

                    studentList.add(student);
                }

                int total = 0;

                for(int counter = 0; counter<studentList.size(); counter++){

                    total = total + studentList.get(counter).getStudGrade();

                }

                float average = total/studentList.size();

                Toast.makeText(MainActivity.this, "Average: " + average, Toast.LENGTH_LONG).show();

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