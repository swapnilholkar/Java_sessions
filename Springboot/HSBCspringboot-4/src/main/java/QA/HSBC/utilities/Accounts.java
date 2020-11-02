package QA.HSBC.utilities;

import org.springframework.stereotype.Service;

@Service
public class Accounts {
	
	public float Tax(float salary) {
		
		
		
		if (salary>1000 && salary<2000) {
			return (float)(salary*0.15);
		}else if (salary>=2000) {
			return (float)(salary*0.25);
		}
		
		return 0;
	}

}
