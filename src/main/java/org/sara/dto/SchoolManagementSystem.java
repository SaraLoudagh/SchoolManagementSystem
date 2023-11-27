package org.sara.dto;

public class SchoolManagementSystem {

    public SchoolManagementSystem(String string) {

    }

    /**
     * Find a department based on the department id
     * @param departmentId the id of the department
     * @return the department's info
     */
    public Department findDepartment(String departmentId) {

    }

    /**
     * Prints the list of teachers that are not null
     */
    public void printTeachers() {

    }

    /**
     * Print the list of all courses in the school
     */
    public void printCourses() {

    }

    /**
     * Modifies the teacher and the course they're teaching
     * @param courseId the id of the new course
     * @param teacherId the id of the new teacher
     */
    public void modifyCourseTeacher(String courseId, String teacherId) {

    }

    /**
     * Create a new department
     * @param name of the department
     */
    public void addDepartment(String name) {

    }

    /**
     * print the list of the students in the school
     */
    public void printStudents() {

    }

    /**
     * Find a student based on their student id
     * @param studentId the id of the student
     * @return the student's info
     */
    public Student findStudent(String studentId) {

    }

    /**
     * Create a new course
     * @param courseName the name of the course
     * @param credit the number of credits the course is worth
     * @param departmentId the id of the department where the course is taught
     */
    public void addCourse(String courseName, double credit, String departmentId) {

    }

    /**
     * Register a new course for a student
     * @param courseId the id of the course
     * @param studentId the student's id
     */
    public void registerCourse(String courseId, String studentId) {

    }

    /**
     * Create a new teacher
     * @param lname the teacher's last name
     * @param fname the teacher's first name
     * @param departmentId the id of the teacher's department
     */
    public void addTeacher(String lname, String fname, String departmentId) {

    }

    /**
     * Find a course based on its id
     * @param courseId the id of the course
     * @return the info on the course
     */
    public Course findCourse(String courseId) {

    }

    /**
     * print the list of departments
     */
    public void printDepartments() {

    }

    /**
     * Create a new student
     * @param fname the first name of the student
     * @param lname the last name of the student
     * @param departmentId the id of the student's department
     */
    public void addStudent(String fname, String lname, String departmentId) {

    }

    /**
     * Find a teacher based on their id
     * @param teacherId the id of the teacher
     * @return
     */
    public Teacher findTeacher(String teacherId) {

    }
}
