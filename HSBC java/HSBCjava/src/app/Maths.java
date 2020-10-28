package app;

/**
 * Maths
 */
public class Maths {

    public void addValues(int a,int b){

        int result;
        result = a+b;
        System.out.println(result);
    }

    public void name(String name){
        System.out.println(name);
    }
    
    public void divide(int a, int b) {
    	try {
    		
    		int ans = a/b;
        	
        	System.out.println("The result is:"+ans);
			
		} catch (NumberFormatException e) {
			System.out.println("cannot do the calculation");
			// TODO: handle exception
		}catch (ArithmeticException e) {
			System.out.println("not allowed to divide by zero");
		}
    		
	}
}
