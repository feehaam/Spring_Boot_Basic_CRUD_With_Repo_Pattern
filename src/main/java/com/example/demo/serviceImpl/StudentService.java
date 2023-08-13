package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.DB;
import com.example.demo.entities.Student;
import com.example.demo.services.IStudent;

@Service
public class StudentService implements IStudent{

	@Override
	public List<Student> getAllStudents() {
		return DB.students;
	}

	@Override
	public boolean addStudent(Student student) {
		DB.students.add(student);
		return true;
	}

	@Override
	public boolean updateStudent(Student student) {
		DB.students.removeIf(s -> s.getId() == student.getId());
		DB.students.add(student);
		return true;
	}

	@Override
	public boolean deleteStudent(int studentId) {
		DB.students.removeIf(s -> s.getId() == studentId);
		return true;
	}

	@Override
	public Student getStudent(int studentId) {
		return DB.students.stream()
		.filter(s -> s.getId() == studentId)
		.findFirst()
		.orElse(null);
	}

}
