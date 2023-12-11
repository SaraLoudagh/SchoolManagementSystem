package org.sara.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Class to create courses
 * @author Sara Loudagh
 */
@Getter
@Setter
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

    /**
     * Method to help registerCourse from SchoolManagementSystem class set a student to a course
     * @param student the student to give to the course
     */
    public void setNewStudent(Student student) {
        students[studentNum] = student;
        studentNum++;
    }

    @Override
    public String toString() {
        String teacherName = null;
        if (teacher != null) {
            teacherName = teacher.getFname() + " " + teacher.getLname();
        }
        String strOut = String.format("Course{id='%s', courseName='%s', credit=%.1f, teacher=%s," +
                        " department='%s', students=", id, courseName, credit, teacherName,
                department.getDepartmentName());
        String studentList = "[";
        for (Student student : students) {
            if (student != null) {
                studentList += String.format("%s %s, ", student.getFname(), student.getLname());
            }
        }
        studentList += "]";
        return strOut + studentList + "}";
    }
}
