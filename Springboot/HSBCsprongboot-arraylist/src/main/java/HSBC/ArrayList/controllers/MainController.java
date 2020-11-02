package HSBC.ArrayList.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import HSBC.ArrayList.utilities.Records;

@RestController
public class MainController {
	
	@Autowired
	Records ref;
	@GetMapping("/showrecord")
	public ArrayList<String> records() {
		
		return ref.showEmployees();
	}
	
	@GetMapping("/addrecord/{name}")
	public String addRecords(@PathVariable("name") String name) {
		
		ref.addRecord(name);
		return "Record is saved";
	}
	
	@GetMapping("/deleterecord/{num}")
	public String deleteRecords(@PathVariable("num") int ind) {
		
		ref.deleteRecord(ind);
		return "Record is deleted";
	}
	

}
