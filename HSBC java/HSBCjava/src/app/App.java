package app;

public class App {
    public static void main(String[] args) throws Exception {
        // int physics,chemistry,maths,total;
        // float percentage;
        // physics=90;
        // chemistry=90;
        // maths=91;
        // total=physics+chemistry+maths;
        // percentage=(float)total*100/300;
        // System.out.println("this is the percentage:"+percentage);

        // if( percentage>=90){
        //     System.out.println("Grade A");
        // }else if(percentage>=80){
        //     System.out.println("Grade B");
        // }else if(percentage>=70){
        //     System.out.println("Grade C");
        // }else{
        //     System.out.println("Failed");
        // }
//....................................................
        // Exam student =new Exam();
        
        // student.name("hello");
        // student.physics(90);;
        // student.chemistry(94);;
        // student.showResults();
//....................................................

        // Maths ta = new Maths();

        // ta.addValues(10, 20);
        // ta.name("swapnil");

//.................................................... inheritance

            // One one = new One();
            // one.mess();
            // one.welcome();
            // one.add(2, 2);
//.................................................... inheritance with abstract classes we use it to force methonds that must be used

            // HSBCbank account = new HSBCbank();
            // account.openAccount();
            // account.showBalance();
            // account.welcome();

//.................................................... having multiple constructors and how they work

            // Exam school =new Exam();
            // school.physics(60);
            // school.chemistry(70);
            // school.showResults();

            // Exam college =new Exam(150);
            // college.physics(130);
            // college.chemistry(70);
            // college.showResults();


// .................................................... static variables and methods work

        // Account hsbc = new Account();
        // Account jpm = new Account();

        // jpm.setDollar(10);
        // hsbc.amount(10);
        // hsbc.setDollar(20);
        // hsbc.amount(10);
        // jpm.setDollar(10);
        // hsbc.setDollar(20);
        // jpm.amount(10);

// .................................................... for the constructor and how child will execute the constructor of parent first and then the child
//also the use of super keyword which allows you to call a second constructor from parent and execute the in Two.java
    	
//    Two t = new Two(3);
    	

    	
    	
// .................................................... this is for the exceptions and handlers. The classes used is AbesentException (which is the exception, it should extend Exception) and Accounts
    	
//    	Maths m = new Maths();
//    	m.divide(10,0);
    	
    	
    	Accounts salesAccounts = new Accounts();
    	Accounts ITAccounts = new Accounts();
    	
    	try {
			salesAccounts.SalarySlip("Swapnil", 2000, 3);
		} catch (AbsentException e) {
			System.out.println("toO many lates");
		}
    	
    	try {
			ITAccounts.SalarySlip("Shafeeq", 3000, 2);
		} catch (AbsentException e) {
			System.out.println("This is okay for the IT");
			// TODO: handle exception
		}
    			
    	
    	

    }
}