package com.salesken.demo.repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.salesken.demo.models.Student;

@Repository
public class StudentRepository {

	private final Map<String,Student> studentMap;
	
    public List<Student> findAll() {
        return studentMap.values().stream().collect(Collectors.toList());
    }
}
