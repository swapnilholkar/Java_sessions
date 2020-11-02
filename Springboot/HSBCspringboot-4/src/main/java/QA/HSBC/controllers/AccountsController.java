package QA.HSBC.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import QA.HSBC.utilities.Accounts;

@RestController
public class AccountsController {
	
	public String message() {
		return "weclome to the Accounts controller";
	}
	
	@Autowired
	Accounts accounts;
	
	@GetMapping("/hsbc/accounts/{name}/{salary}")
	
	public String salary(@PathVariable("name") String name, @PathVariable("salary") float sal) {
		
//		float salVal=Float.parseFloat(sal);
		
		
		float acctoRet=accounts.Tax(sal);
		
		return "tax is "+acctoRet;
		
		
		
		
	}

}
