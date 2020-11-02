package QA.HSBC.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HRController {

	public String message() {
		return "weclome to the HR controller";
	}
	
	@GetMapping("hr")
	public String aboutus() {
		return message();
		
	}
}
