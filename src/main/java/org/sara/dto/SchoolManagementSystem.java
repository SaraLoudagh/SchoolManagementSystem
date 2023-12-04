package org.sara.dto;

import lombok.ToString;

@ToString
public class SchoolManagementSystem {
    private String name;
    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;
    private static final int MAX_DEPARTMENTS_NUM = 5;
    private static final int MAX_TEACHERS_NUM = 20;
    private static final int MAX_STUDENTS_NUM = 200;
    private static final int MAX_COURSES_NUM = 30;
    private int departmentNum = 0;
    private int studentNum = 0;
    private int teacherNum = 0;
    private int courseNum = 0;

    public SchoolManagementSystem(String name) {
        this.name = name;
        this.departments = new Department[MAX_DEPARTMENTS_NUM];
        this.students = new Student[MAX_STUDENTS_NUM];
        this.teachers = new Teacher[MAX_TEACHERS_NUM];
        this.courses = new Course[MAX_TEACHERS_NUM];
    }

    /**
     * Find a department based on the department id
     * @param departmentId the id of the department
     * @return the department's info
     */
    public Department findDepartment(String departmentId) {
        Department d1 = null;
        for (Department department : departments) {
            if (department.getId().equals(departmentId)) {
                d1 = department;
                break;
            }
        }
        return d1;
    }

    /**
     * Prints the list of teachers that are not null
     */
    public void printTeachers() {
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }
    }

    /**
     * Print the list of all courses in the school
     */
    public void printCourses() {
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
            }
        }
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
     * @param departmentName of the department
     */
    public void addDepartment(String departmentName) {
        if (departmentNum < MAX_DEPARTMENTS_NUM) {
            departments[departmentNum] = new Department(departmentName);
            departmentNum++;
        }
        else {
            System.out.println("add department failed");
        }
    }

    /**
     * print the list of the students in the school
     */
    public void printStudents() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    /**
     * Find a student based on their student id
     * @param studentId the id of the student
     * @return the student's info
//     */
    public Student findStudent(String studentId) {
        Student s1 = null;
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                s1 = student;
                break;
            }
        }
        return s1;
    }

    /**
     * Create a new course
     * @param courseName the name of the course
     * @param credit the number of credits the course is worth
     * @param departmentId the id of the department where the course is taught
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        if (courseNum < MAX_COURSES_NUM) {
            courses[courseNum] = new Course(credit, findDepartment(departmentId), courseName);
        }
        else {
            System.out.println("Max course amount reached, add course failed");
        }
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
     * @param fname the teacher's last name
     * @param lname the teacher's first name
     * @param departmentId the id of the teacher's department
     */
    public void addTeacher(String fname, String lname, String departmentId) {
        if (teacherNum < MAX_TEACHERS_NUM) {
            teachers[teacherNum] = new Teacher(fname, lname, findDepartment(departmentId));
            teacherNum++;
        }
        else {
            System.out.println("Max teacher reached. Add teacher failed.");
        }
    }

    /**
     * Find a course based on its id
     * @param courseId the id of the course
     * @return the info on the course
     */
    public Course findCourse(String courseId) {
        Course c1 = null;
        for (Course course : courses) {
            if (course.getId().equals(courseId)) {
                c1 = course;
                break;
            }
        }
        return c1;
    }

    /**
     * print the list of departments
     */
    public void printDepartments() {
        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    /**
     * Create a new student
     * @param fname the first name of the student
     * @param lname the last name of the student
     * @param departmentId the id of the student's department
     */
    public void addStudent(String fname, String lname, String departmentId) {
        if (studentNum < MAX_STUDENTS_NUM) {
            students[studentNum] = new Student(lname, fname, findDepartment(departmentId));
            studentNum++;
        }
        else {
            System.out.println("max student number reached, add student failed");
        }
    }

    /**
     * Find a teacher based on their id
     * @param teacherId the id of the teacher
     * @return
     */
    public Teacher findTeacher(String teacherId) {
        Teacher t1 = null;
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(teacherId)) {
                t1 = teacher;
                break;
            }
        }
        return t1;
    }
}
