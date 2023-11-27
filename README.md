# SchoolManagementSystem
Final project for Introduction to Programming class

A school management system that can store departments, students, teachers and courses. 

The SchoolManagementSystem class lists all the necessary methods to manage the school
findDepartment(),
`findStudent(String studentId)`, `findCourse(String courseId)` and `findTeacher(String teacherId)` are used to find an element based on its id
`printTeachers()`, `printCourses()`, `printStudents()` and `printDepartments()` are used to print a list of these elements
`modifyCourseTeacher(String courseId, String teacherId)` is used to modidfy a course and the teacher
`addDepartment(String name)`, `addCourse(String courseName, double credit, String departmentId)`, `addTeacher(String lname, String fname, String departmentId)` and `addStudent(String fname, String lname, String departmentId)` are used to create new elements
`registerCourse(String courseId, String studentId)` is used to register a student to a course

The Student class is used to create new students
The Teacher class is used to create new classes
The Course class is used to create new courses
The Department class is used to create new departments

Here is class diagram to explain the code:
<img width="816" alt="image" src="https://github.com/SaraLoudagh/SchoolManagementSystem/assets/150824189/87687f03-58fe-465a-a2ca-905c24162886">
