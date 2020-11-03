package com.hsbc.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.Entities.College;
import com.hsbc.Repos.CollegeRepo;

//have to make it rest
@RestController
public class FirstController {
	
	@Autowired
	CollegeRepo repo;
	
	@GetMapping("/showbyname/{name}")
	public List<College> showbyname(@PathVariable("name") String name) {
		return repo.findByName(name);
		
		
	}
	
	
	@PostMapping("/recordEntry")
	public String recordEntry(@RequestBody College ref) {
		

		Optional<College> student = repo.findById(ref.getRegno());
		if(student.isPresent()) {
			return " regno already exisits";
		}else {
			repo.save(ref);
		}
		
		return "saved";
		
		
		
//		
//		
		
		
		
	}
	
	@GetMapping("/saverecord/{regno}/{name}/{marks}")
	public String saveRecord(@PathVariable("regno")int reg,@PathVariable("name")String name,@PathVariable("marks")int marks) {
		
		College student = new College();
		
		student.setRegno(reg);
		student.setName(name);
		student.setMarks(marks);
		
		repo.save(student);
		
		return "record saved";
		
	}
	
	@GetMapping("/showrecord/{regno}")
	public College showRecord(@PathVariable("regno")int reg) {
		
//		College student = null;
//		Optional<College> opt = repo.findById(reg);
//		
//		if (opt.isPresent()) {
//			student = opt.get();
//		}
//		return student;
		
		
		Optional<College> student = repo.findById(reg);
		return student.orElse(null);
		
		
	}

}
