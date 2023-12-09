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
        System.out.println("Displaying all teachers:\n-------------------");
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
        System.out.println("Displaying all courses:\n-------------------");
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
        findCourse(courseId).setTeacher(findTeacher(teacherId));
    }

    /**
     * Create a new department
     * @param departmentName of the department
     */
    public void addDepartment(String departmentName) {
        if (departmentNum < MAX_DEPARTMENTS_NUM) {
            departments[departmentNum] = new Department(departmentName);
            System.out.printf("%s added successfully.\n", departments[departmentNum++]);
        }
        else {
            System.out.println("Max department reached, add department failed");
        }
    }

    /**
     * Print the list of the students in the school
     */
    public void printStudents() {
        System.out.println("Displaying all students:\n-------------------");
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
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null;
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
            System.out.printf("%s added successfully.\n", courses[courseNum++]);
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
        boolean isAlreadyRegistered = false;
        for (int i = 0; i < findStudent(studentId).getCourseNum(); i++) {
            if (findStudent(studentId).getCourses()[i].equals(findCourse(courseId))) {
                System.out.printf("Student %s has already registered Course %s," +
                        " register course %s for student %s failed.\n", studentId, courseId, courseId, studentId);
                isAlreadyRegistered = true;
                break;
            }
        }
        if (!isAlreadyRegistered) {
            if (findStudent(studentId) == null) {
                System.out.printf("Cannot find any student match with student id %s," +
                        " register course for student %s failed.", studentId, studentId);
            } else if (findCourse(courseId) == null) {
                System.out.printf("Cannot find any student match with course id %s," +
                        " register course for student %s failed.", courseId, studentId);
            } else if (findStudent(studentId).getCourseNum() == 5) {
                System.out.printf("Student %s has already registered 5 courses," +
                        " register course for student %s failed. ", studentId, studentId);

            } else if (findCourse(courseId).getStudentNum() == 20) {
                System.out.printf("Course %s has been fully registered," +
                        " register course %s for student S001 failed", courseId, courseId);

            } else {
                findStudent(studentId).setNewCourse(findCourse(courseId));
                findCourse(courseId).setNewStudent(findStudent(studentId));
                System.out.println("Student course registered successfully.");
                System.out.printf("Latest student info: %s\n", findStudent(studentId));
                System.out.printf("Latest course info: %s\n", findCourse(courseId));
            }
        }
    }

    /**
     * Create a new teacher
     * @param fname the teacher's last name
     * @param lname the teacher's first name
     * @param departmentId the id of the teacher's department
     */
    public void addTeacher(String fname, String lname, String departmentId) {
        if (teacherNum < MAX_TEACHERS_NUM) {
            teachers[teacherNum] = new Teacher(lname, fname, findDepartment(departmentId));
            System.out.printf("%s added successfully.\n", teachers[teacherNum++]);
        }
        else {
            System.out.println("Max teacher reached. Add a new teacher failed.");
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
        System.out.println("Displaying all the departments:\n-------------------");
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
            System.out.printf("%s added successfully.\n", students[studentNum++]);
        }
        else {
            System.out.println("Max student number reached, add a new student failed");
        }
    }

    /**
     * Find a teacher based on their id
     * @param teacherId the id of the teacher
     * @return the teacher
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
