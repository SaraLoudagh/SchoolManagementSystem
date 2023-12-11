package org.sara;

/**
 * Driver class
 */
import org.sara.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        // create the school system
        SchoolManagementSystem vanier = new SchoolManagementSystem("Vanier College");

        // add departments
        vanier.addDepartment("Computer Science");
        vanier.addDepartment("Social science");
        vanier.addDepartment("Computer Technology");
        vanier.addDepartment("Mathematics");
        vanier.addDepartment("Acting");

        // add students
        vanier.addStudent("Ricardo", "Lopez", "D001");
        vanier.addStudent("Elio", "Reys", "D002");
        vanier.addStudent("Mia", "Chips", "D002");

        // add teachers
        vanier.addTeacher("Ryan", "Gosling", "D001");
        vanier.addTeacher("Yi", "Wang", "D001");
        vanier.addTeacher("Bella", "Blake", "D002");

        // add courses
        vanier.addCourse("Intro to programming", 3, "D001");
        vanier.addCourse("Business", 2.7, "D002");
        vanier.addCourse("Computer games", 1, "D003");
        vanier.addCourse("Statistics", 3, "D004");
        vanier.addCourse("Shakespeare", 2.3, "D005");
        vanier.addCourse("OOP", 3, "D001");

        // register courses
        vanier.registerCourse("C001", "S001");
        vanier.registerCourse("C002", "S003");

        // give a course to a teacher
        vanier.modifyCourseTeacher("C001", "T001");
        vanier.modifyCourseTeacher("C002", "T001");
        vanier.modifyCourseTeacher("C003", "T001");
        vanier.modifyCourseTeacher("C004", "T002");
        vanier.modifyCourseTeacher("C005", "T003");
        vanier.modifyCourseTeacher("C006", "T003");

        // print students, teachers, courses and department lists
        vanier.printStudents();
        vanier.printTeachers();
        vanier.printCourses();
        vanier.printDepartments();
    }
}
