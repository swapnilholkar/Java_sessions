

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int salary=2000;
		float net_salary;
		
		Maths m = new Maths();
		net_salary=salary- m.tax(salary);
		
		
		
		System.out.println("your net salary is: "+ net_salary);
		
	}

}


