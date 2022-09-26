package com.project.dao;

import java.util.List;

import com.project.entities.Student;

public interface StudentDao {

	public List<Student> getStudents();

	public void saveStudent(Student student);

	public Student getStudentById(int id);

	public void deleteStudentById(int id);
}
