package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.*;
import com.example.demo.services.*;

@Service
public class CourseManagementService implements ICourseManagement {
	@Autowired
	private IStudent studentService;
	@Autowired
	private ICourse courseService;

	@Override
	public boolean addCourse(int studentId, int courseId) {
		Student student = studentService.getStudent(studentId);
		Course course = courseService.getCourse(courseId);

		if (student != null && course != null) {
			student.getCourses().add(course);
			return true;
		}
		return false;
	}

	@Override
	public boolean dropCourse(int studentId, int courseId) {
		Student student = studentService.getStudent(studentId);
		Course course = courseService.getCourse(courseId);

		if (student != null && course != null) {
			student.getCourses().remove(course);
			return true;
		}
		return false;
	}
}
