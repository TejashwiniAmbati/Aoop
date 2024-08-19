package com.example.sis.student;

import java.util.HashMap;
import java.util.Map;

public class CourseManagement {
    private Map<String, Course> courseMap;

    public CourseManagement() {
        this.courseMap = new HashMap<>();
    }

    public void addCourse(Course course) {
        courseMap.put(course.getCourseId(), course);
    }

    public Course getCourse(String courseId) {
        return courseMap.get(courseId);
    }
}