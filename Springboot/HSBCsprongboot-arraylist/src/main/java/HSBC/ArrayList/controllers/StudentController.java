package HSBC.ArrayList.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import HSBC.ArrayList.entities.Student;
import HSBC.ArrayList.utilities.StudentRecords;


@RestController
public class StudentController {
	
	@Autowired
	StudentRecords ref;
	
	
	
	@GetMapping("/showstudents")
	public ArrayList<Student> showStudents(){
		
		return ref.showStudents();
	}
	
	@GetMapping("/saverecords/{regno}/{name}/{marks}")
	public String saveRecord(@PathVariable("regno") int regno1,@PathVariable("name") String name1,@PathVariable("marks") int marks1) {
		
		Student stu = new Student();
		stu.regno=regno1;
		stu.name=name1;
		stu.marks=marks1;
		
		ref.addrecord(stu);
		
		return "record added";
		
	}
	
	@GetMapping("/whichstudent/{regno}")
	public String whichStudent(@PathVariable("regno") int reg){
		String ans="";
		
		if (ref.studentWho(reg)==null) {
			ans= "no data found";
		}else {
			Student s = ref.studentWho(reg);
			
			ans="regno is:"+s.regno+" name is:"+s.name+"marks is:"+s.marks;
		}
		
		return ans;
		
		
	}

}
