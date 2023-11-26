package org.sara.dto;

public class Department {
    private String id;
    private String departmentName;
    private static int nextId;

    public Department(String departmentName) {
        this.id = "D" + nextId++;
        this.departmentName = departmentName;
    }
}
