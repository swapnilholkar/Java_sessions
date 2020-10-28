package app;

public class Accounts {
	
	public void SalarySlip(String name,int salary, int absent)throws AbsentException {
		
		float tax,netsalary;
		if (absent>10) {
			AbsentException e = new AbsentException();
			throw e;
			
		}else {
			tax=(float)salary*25/100;
			netsalary=salary-tax;
			System.out.println("Employee name: "+name);
			System.out.println("Your salary is: "+ salary);
			System.out.println("Tax is: "+tax);
			System.out.println("Net Salary is: "+ netsalary);
					
		}
	}

}
