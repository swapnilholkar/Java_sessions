package QA.HSBC.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {
	
	public String message() {
		return "weclome to the Sales controller";
	}
	
	@GetMapping("hsbc/sales")
	public String aboutus() {
		return message();
		
	}

}
