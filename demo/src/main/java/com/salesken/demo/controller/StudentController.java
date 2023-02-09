package com.salesken.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesken.demo.models.Semester;
import com.salesken.demo.models.Student;
import com.salesken.demo.service.IStudentMarksService;

@Controller
public class StudentController {

	@Autowired
	IStudentMarksService studentMarksService;
	
	@GetMapping("/averagePercent")
	double averagePercentageOfClass(Student student) {
		return studentMarksService.averagePercentageOfClass(student);
	}
	
	@GetMapping("/topStudents")
	List<Student> topTwoStudents(Student student){
		return studentMarksService.topTwoStudents(student);
	}
	@GetMapping("/averageMarks")
	double averageMarksInSubject(Semester sem) {
		return studentMarksService.averageMarksInSubject(sem);
	}
}
