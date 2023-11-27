package org.sara.dto;

import lombok.ToString;

@ToString
public class Teacher {
    private String lname;
    private String fname;
    private Department department;
    private String id;
    private static int nextId = 1;

    public Teacher(String lname, String fname, Department department) {
        this.lname = lname;
        this.fname = fname;
        this.department = department;
        this.id = String.format("T%03d", nextId++);
    }
}
