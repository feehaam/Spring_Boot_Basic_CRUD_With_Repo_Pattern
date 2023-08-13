package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;

@Service
public interface ICourse {
    List<Course> getAllCourses();
    boolean addCourse(Course course);
    boolean updateCourse(Course course);
    boolean deleteCourse(int courseId);
    Course getCourse(int courseId);
}
