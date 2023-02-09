package com.salesken.demo.models;

import java.util.List;


public class Student {
	
	
	private String name;
	private List<Semester> semesters;
	  
	  public int getTotalSubjects() {
	    int totalSubjects = 0;
	    for (Semester semester : semesters) {
	      totalSubjects += semester.getSubjects().size();
	    }
	    return totalSubjects;
	  }


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Semester> getSemesters() {
		return semesters;
	}

	public void setSemesters(List<Semester> semesters) {
		this.semesters = semesters;
	}

	public Semester getLatestSemester() {
		
		int lastSemesterIndex = semesters.size() - 1;
		Semester lastSemester = semesters.get(lastSemesterIndex);
		
		return lastSemester;
	}

	
}
