package HSBC.ArrayList.utilities;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import HSBC.ArrayList.entities.Student;
import HSBC.ArrayList.utilities.StudentRecords;


@Service
public class StudentRecords {

	ArrayList<Student> list = new ArrayList<Student>();
	
	
	StudentRecords() {
		
		Student stu1 = new Student();
		stu1.regno=(01);
		stu1.name="Swapnil";
		stu1.marks=(89);
		
		list.add(stu1);
		
		Student stu2 = new Student();
		stu2.regno=(02);
		stu2.name="tony";
		stu2.marks=(70);
		
		list.add(stu2);
		
		Student stu3 = new Student();
		stu3.regno=(03);
		stu3.name="amy";
		stu3.marks=(60);
		
		list.add(stu3);
		
		
		
		
	}
	
	public ArrayList<Student> showStudents(){
		
		return list;
	}
	
	public void addrecord(Student s) {
		
		list.add(s);
		
		
	}
	
	public Student studentWho(int reg){
		
		
		for (Student ele : list) {
			if (ele.regno==reg) {
				return ele;
			}
		}
		
		return null;
		
		
			
	}	
		
		
	
}
