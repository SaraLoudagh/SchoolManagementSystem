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
        vanier.addTeacher("Bella", "Blake", "D002");
        vanier.addCourse("Intro to programming", 3, "D001");
        vanier.registerCourse("C001", "S001");
        vanier.registerCourse("C001", "S001");
        vanier.modifyCourseTeacher("C001", "T001");
        vanier.modifyCourseTeacher("C001", "T021");
        vanier.printStudents();
        vanier.printTeachers();
        vanier.printCourses();
        vanier.printDepartments();
    }
}
