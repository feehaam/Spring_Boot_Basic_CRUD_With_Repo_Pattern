package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.DB;
import com.example.demo.entities.Course;
import com.example.demo.services.ICourse;

@Service
public class CourseService implements ICourse {

    @Override
    public List<Course> getAllCourses() {
        return DB.courses;
    }

    @Override
    public boolean addCourse(Course course) {
        DB.courses.add(course);
        return true;
    }

    @Override
    public boolean updateCourse(Course course) {
        DB.courses.removeIf(c -> c.getId() == course.getId());
        DB.courses.add(course);
        return true;
    }

    @Override
    public boolean deleteCourse(int courseId) {
        DB.courses.removeIf(c -> c.getId() == courseId);
        return true;
    }

    @Override
    public Course getCourse(int courseId) {
        return DB.courses.stream()
            .filter(c -> c.getId() == courseId)
            .findFirst()
            .orElse(null);
    }
}
