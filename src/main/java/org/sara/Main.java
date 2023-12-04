package org.sara;

/**
 * Driver class
 */
import org.sara.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem school = new SchoolManagementSystem("Vanier College");
        school.addDepartment("hey");
        school.addDepartment("hey");
        school.addStudent("ricardo", "lopez", "D001");
        school.addTeacher("haha", "hihi", "D001");
        school.addCourse("haha", 5, "D001");
        System.out.println(school);
        school.printDepartments();
        school.printCourses();
        school.printTeachers();
        school.printStudents();


    }
}