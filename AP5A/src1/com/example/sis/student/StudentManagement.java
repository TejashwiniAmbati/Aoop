package com.example.sis.student;

import java.util.HashMap;
import java.util.Map;

public class StudentManagement {
    private Map<String, Student> studentMap;

    public StudentManagement() {
        this.studentMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        studentMap.put(student.getStudentId(), student);
    }

    public Student getStudent(String studentId) {
        return studentMap.get(studentId);
    }
}
