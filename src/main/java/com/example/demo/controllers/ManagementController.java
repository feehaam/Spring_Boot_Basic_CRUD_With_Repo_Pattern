package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.ICourseManagement;

@RestController
public class ManagementController {
	private final ICourseManagement manage;
	public ManagementController(ICourseManagement manage) {
		this.manage = manage;
	}
	@PostMapping("/student/{studentId}/enroll/{courseId}")
	public ResponseEntity<Object> addCourse(@PathVariable int studentId, @PathVariable int courseId){
		return ResponseEntity.ok(manage.addCourse(studentId, courseId));
	}
	@DeleteMapping("/student/{studentId}/drop/{courseId}")
	public ResponseEntity<Object> dropCourse(@PathVariable int studentId, @PathVariable int courseId){
		return ResponseEntity.ok(manage.dropCourse(studentId, courseId));
	}
}
