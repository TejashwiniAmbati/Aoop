package com.example.sis.student;

public class EnrollmentManager {

    public void enroll(Student student, Course course) {
        student.enrollCourse(course.getCourseId());
        course.addStudent(student.getStudentId());
    }

    public void displayEnrolledCourses(Student student) {
        System.out.println("Courses enrolled by " + student.getName() + ": " + student.getEnrolledCourses());
    }

    public void displayEnrolledStudents(Course course) {
        System.out.println("Students enrolled in " + course.getCourseName() + ": " + course.getEnrolledStudents());
    }
}