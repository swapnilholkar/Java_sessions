package HSBC.controller.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/hello")
	public String Aboutus() {
		
		return ("this is the getmapping method for about us");
		
	}
	
	@PostMapping("/hello")
	public String postAboutus() {
		return ("this is the postmappting method for about us");
	}

}
