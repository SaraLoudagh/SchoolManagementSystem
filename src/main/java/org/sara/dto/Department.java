package org.sara.dto;

import lombok.Getter;

@Getter
public class Department {
    private String id;
    private String departmentName;
    private static int nextId = 1;

    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department(" +
                "id='" + id + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ')';
    }
}
