package org.sara;

/**
 * Driver class
 */
import org.sara.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem school = new SchoolManagementSystem("Vanier College");
        school.addDepartment("Computer Science");
        school.addDepartment("Social science");
        school.addStudent("Ricardo", "Lopez", "D001");
        school.addTeacher("Ryan", "Gosling", "D001");
        school.addTeacher("Bella", "Blake", "D001");
        school.addCourse("Intro to programming", 3, "D001");
        System.out.println(school.findCourse("C001"));
        school.registerCourse("C001", "S001");
        school.registerCourse("C001", "S001");
        school.printStudents();
        school.modifyCourseTeacher("C001", "T002");
        System.out.println(school.findCourse("C001"));

    }
}
