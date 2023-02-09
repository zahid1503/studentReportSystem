package com.salesken.demo.repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.salesken.demo.models.Semester;

@Repository
public class SemesterRepository {
	private final Map<String,Semester> semesterMap;
	
    public List<Semester> findAll() {
        return semesterMap.values().stream().collect(Collectors.toList());
    }
}
