package com.example.sis.student;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        CourseManagement courseManagement = new CourseManagement();
        EnrollmentManager enrollmentManager = new EnrollmentManager();

        // Adding students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");
        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);

        // Adding courses
        Course course1 = new Course("C001", "Math 101");
        Course course2 = new Course("C002", "Physics 101");
        courseManagement.addCourse(course1);
        courseManagement.addCourse(course2);

        // Enrolling students in courses
        enrollmentManager.enroll(student1, course1);
        enrollmentManager.enroll(student2, course2);

        // Display enrolled courses and students
        enrollmentManager.displayEnrolledCourses(student1);
        enrollmentManager.displayEnrolledStudents(course2);
    }
}
