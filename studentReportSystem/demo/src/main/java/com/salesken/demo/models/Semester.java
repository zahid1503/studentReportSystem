package com.salesken.demo.models;

import java.util.List;

public class Semester {
	
	
	private int number;
	private List<Subject> subjects;

	public List<Subject> getSubjects() {
		return subjects;
	}
	public Subject getSubject() {
		return subjects.stream().findAny().get();
	}

	public int getMarksSum() {
		 int marksSum = 0;
		    for (Subject subject : subjects) {
		      marksSum += subject.getMarks();
		    }
		 return marksSum;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Semester [number=" + number + ", subjects=" + subjects + "]";
	}
	
	
}
