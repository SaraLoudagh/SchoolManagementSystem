package org.sara.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
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
    }
}
