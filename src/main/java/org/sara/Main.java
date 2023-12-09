package org.sara;

/**
 * Driver class
 */
import org.sara.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem vanier = new SchoolManagementSystem("Vanier College");
        vanier.addDepartment("Computer Science");
        vanier.addDepartment("Social science");
        vanier.addStudent("Ricardo", "Lopez", "D001");
        vanier.addTeacher("Ryan", "Gosling", "D001");
        vanier.addTeacher("Bella", "Blake", "D001");
        vanier.addCourse("Intro to programming", 3, "D001");
        System.out.println(vanier.findCourse("C001"));
        vanier.registerCourse("C001", "S001");
        vanier.registerCourse("C001", "S001");
        vanier.printStudents();
        vanier.modifyCourseTeacher("C001", "T002");
        System.out.println(vanier.findCourse("C001"));

    }
}
