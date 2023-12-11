package org.sara.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Class to create teachers
 * @author Sara Loudagh
 */
@Getter
@Setter
public class Teacher {
    private String lname;
    private String fname;
    private Department department;
    private String id;
    private Course course;
    private static int nextId = 1;

    public Teacher(String lname, String fname, Department department) {
        this.lname = lname;
        this.fname = fname;
        this.department = department;
        this.id = String.format("T%03d", nextId++);
    }

    @Override
    public String toString() {
        String strOut = String.format("Teacher{id='%s', fname='%s', lname='%s', department='%s'",
                id, fname, lname, department.getDepartmentName());
        if (course != null) {
            strOut += String.format(", course=%s", course.getCourseName());
        }
        return strOut + "}";
    }
}
