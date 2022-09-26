package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.StudentDao;
import com.project.entities.Student;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	
	@Transactional
	@Override
	public List<Student> getStudents() {
		List<Student> getStudents = studentDao.getStudents();
		return getStudents;
	}

	@Transactional
	@Override
	public void saveStudent(Student student) {
		
		studentDao.saveStudent(student);
	}

	@Transactional
	@Override
	public Student getStudentById(int id) {
		Student student = studentDao.getStudentById(id);
		return student;
	}
	
	@Transactional
	@Override
	public void deleteStudentById(int id) {
		studentDao.deleteStudentById(id);
		
	}

}
