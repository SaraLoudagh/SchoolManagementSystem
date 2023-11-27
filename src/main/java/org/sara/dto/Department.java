package org.sara.dto;

import lombok.ToString;

@ToString
public class Department {
    private String id;
    private String departmentName;
    private static int nextId;

    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }
}
