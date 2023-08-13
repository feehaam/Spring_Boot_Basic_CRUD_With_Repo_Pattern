package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.ICourse;

@RestController
public class CourseController {
	
	@Autowired
	ICourse courses;
	
	@GetMapping("/course")
	public Object getAllCourses() {
		return courses.getAllCourses();
	}
	
	@GetMapping("/course/{id}")
	public Object getAllCourses(@PathVariable int id) {
		return courses.getCourse(id);
	}
	
	@PostMapping("/course")
	public Object addCourse(@RequestBody Course course) {
		return courses.addCourse(course);
	}
	
	@PutMapping("/course")
	public Object updateCourse(@RequestBody Course course) {
		return courses.updateCourse(course);
	}
	
	@DeleteMapping("/course/{id}")
	public Object deleteCourse(@PathVariable int id) {
		return courses.deleteCourse(id);
	}
}
