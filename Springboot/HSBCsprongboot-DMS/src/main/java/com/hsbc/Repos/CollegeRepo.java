package com.hsbc.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hsbc.Entities.College;

@Repository

public interface CollegeRepo extends JpaRepository<College,Integer>{

	public List<College> findByName(String na);
	public List<College> findByMarks(int na);
}
