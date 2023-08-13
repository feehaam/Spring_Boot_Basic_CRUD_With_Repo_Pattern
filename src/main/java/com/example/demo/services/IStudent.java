package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entities.Student;

@Service
public interface IStudent {
	List<Student> getAllStudents();
	boolean addStudent(Student student);
	boolean updateStudent(Student student);
	boolean deleteStudent(int studentId);
	Student getStudent(int studentId);
}
