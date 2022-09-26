package com.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.entities.Student;

@Repository
public class StudentDaoImplementation implements StudentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> getStudents() {
	
		// get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		//create a query that will load the students
		Query<Student> query = session.createQuery("from Student order by lastName",Student.class);
		
		List<Student> studentList = query.getResultList();
		
		return studentList;
	}

	@Override
	public void saveStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(student);
		
	}

	@Override
	public Student getStudentById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Student student = session.get(Student.class, id);
		return student;
	}

	@Override
	public void deleteStudentById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Student where id=:studentID");
		query.setParameter("studentID", id);
		query.executeUpdate();
	}

}
