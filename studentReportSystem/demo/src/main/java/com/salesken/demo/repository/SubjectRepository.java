package com.salesken.demo.repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.salesken.demo.models.Subject;

@Repository
public class SubjectRepository {
	
	private final Map<String,Subject> subjectMap;
	
	    public List<Subject> findAll() {
	        return subjectMap.values().stream().collect(Collectors.toList());
	    }
	 
}
