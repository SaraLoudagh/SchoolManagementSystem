package org.sara.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String lname;
    private String fname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private Department department;
    private static int nextId = 1;
    private static final int MAX_COURSES_NUM = 5;
    private static final int MAX_STUDENTS_NUM = 200;

    public Student(String lname, String fname, Department department) {
        this.lname = lname;
        this.fname = fname;
        this.department = department;
        this.id = String.format("S%03d", nextId++);
        this.courses = new Course[MAX_COURSES_NUM];
    }

    /**
     * Method to help registerCourse from SchoolManagementSystem class set a course to a student
     * @param course the course to give to the student
     */
    public void setNewCourse(Course course) {
        this.courses[courseNum] = course;
        this.courseNum++;
    }

    @Override
    public String toString() {
        String strOut = String.format("Student{id='%s', fname='%s', lname='%s', %s " +
                "courseNum=%d, ", id, fname, lname, department, courseNum);
        String courseList = "courses=[";
        for (Course course : courses) {
            if (course != null) {
                courseList += course.getCourseName() + ", ";
            }
        }
        return strOut + courseList + "]}";
    }
}
