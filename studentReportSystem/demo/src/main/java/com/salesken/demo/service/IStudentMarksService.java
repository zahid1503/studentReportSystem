package com.salesken.demo.service;

import java.util.List;

import com.salesken.demo.models.Semester;
import com.salesken.demo.models.Student;

public interface IStudentMarksService {

	double averagePercentageOfClass(Student student);
	List<Student> getTopTwoStudents(Student student);
	double averageMarksInSubject(Semester sem);
	
	
}
