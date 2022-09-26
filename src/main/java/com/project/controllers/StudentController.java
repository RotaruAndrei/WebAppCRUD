package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.entities.Student;
import com.project.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/list")
	public String studentList(Model model) {
		
		List<Student> getStudents = studentService.getStudents();
		
		model.addAttribute("students",getStudents);
		
		return "list-student";
	}
	
	@GetMapping("/showFormForAdd")
	public String addStudent(Model model) {
		
		//create a new student object
		//to bind the data <-> html form
		Student student = new Student();
		
		model.addAttribute("student",student);
		
		return "addStudentForm";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent (@ModelAttribute("student")Student student) {
		
		studentService.saveStudent(student);
		
		return "redirect:/student/list";
	}
	
	@GetMapping("/showUpdateForm")
	public String updateStudent (@RequestParam("studentID")int id, Model model) {
		Student student =  studentService.getStudentById(id);
		model.addAttribute("student", student);
		return "addStudentForm";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("studentID")int id) {
		studentService.deleteStudentById(id);
		return "redirect:/student/list";
	}
}
