package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public interface ICourseManagement {
	boolean addCourse(int studentId, int courseId);
	boolean dropCourse(int studentId, int courseId);
}
