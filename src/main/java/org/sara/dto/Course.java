package org.sara.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString
public class Course {
    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;
    private static int nextId = 1;
    private static final int MAX_STUDENT_NUM = 5;

    public Course(double credit, Department department, String courseName) {
        this.credit = credit;
        this.department = department;
        this.courseName = courseName;
        this.id = String.format("C%03d", nextId++);
        this.students = new Student[MAX_STUDENT_NUM];
    }
    public void setNewStudent(Student student) {
        this.students[studentNum] = student;
        this.studentNum++;
    }

    @Override
    public String toString() {
        String strOut = String.format("Course{id='%s', courseName='%s', credit=%f, teacher=%s," +
                " department='%s', students=", this.id, this.courseName, this.credit, this.teacher,
                this.department);
        String studentList = "[";
        for (Student student : students) {
            if (student != null) {
                studentList += student + ", ";
            }
        }
        return strOut + studentList;
    }
}
