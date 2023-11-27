package org.sara.dto;

import lombok.ToString;

@ToString
public class Student {
    private String lname;
    private String fname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private Department department;
    private static int nextId = 1;
    private static final int MAX_COURSES_NUM = 5;

    public Student(String lname, String fname, Department department) {
        this.lname = lname;
        this.fname = fname;
        this.department = department;
        this.id = String.format("S%03d", nextId++);
    }
}
