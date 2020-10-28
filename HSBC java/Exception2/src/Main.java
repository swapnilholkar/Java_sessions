
public class Main {

	public static void main(String[] args) {
		
		String num1,num2;
		float result;
		num1="24";
		num2="12";
		
		try {
			result= Integer.parseInt(num1) / Integer.parseInt(num2);
			System.out.println("Result is: "+result);
			
		} catch (NumberFormatException e) {
			System.out.println("only digits can be used");	
		}catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}catch (Exception e) {
			// this is the parent exception and will execute only when all the above have not been triggered
			System.out.println("Something went wrong");
		}

	}

}
