package com.salesken.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesken.demo.models.Semester;
import com.salesken.demo.models.Student;
import com.salesken.demo.models.Subject;

@Service
public class StudentMarksService implements IStudentMarksService{
	
	 private List<Student> students;

	@Override
	public double averagePercentageOfClass(Student student) {
		
		 int totalMarks = 0;
		 int totalSubjects = 0;
		 
		    for (Student stud : students) {
		    	
		      Semester latestSemester = stud.getLatestSemester();
		      
		      totalMarks += latestSemester.getMarksSum();
		      
		      totalSubjects += latestSemester.getSubjects().size();
		    }
		    
		 return (double) totalMarks / (totalSubjects * students.size());
		  
		
	}
	
	
	
	@Override
	public double averageMarksInSubject(Semester semesters) {
		
		Subject sub = semesters.getSubject();
		int sum = 0;
		int count = 0;

		for (Student student : students) {
		    int mark = student.getMark(sub);
		    sum += mark;
		    count++;
		}
		double average = (double) sum / count;
	}
	

	@Override
	public List<Student> getTopTwoStudents(List<Student> stud, Semester semesters ) {
		

		for (Student student : students) {
		    int sum = 0;
		    for (String subject : semesters.getSubject();) {
		        int mark = student.getMark(subject);
		        sum += mark;
		    }
		    double average = (double) sum / subjects.length;
		    student.setAverage(average);
		}
	}



	@Override
	public List<Student> topTwoStudents(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
