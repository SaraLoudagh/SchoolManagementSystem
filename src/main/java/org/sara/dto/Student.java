package org.sara.dto;


public class Student {
    private String lname;
    private String fname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private Department department;
    private static int nextId = 1;

    public Student(String lname, String fname, Department department) {
        this.lname = lname;
        this.fname = fname;
        this.department = department;
        this.id = "S" + nextId++;
    }
}
