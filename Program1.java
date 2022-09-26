import java.util.Scanner;

public class Program1 {
	
	//creation of calculator method
	static double calculator(double a,double b,String operation) {
		
		if (operation.equals("add")|| operation.equals("Add")) {
			return a+b;
		}
		
		else if (operation.equals("sub")|| operation.equals("Sub")) {
			return a-b;
		}
		
		else if (operation.equals("mul")|| operation.equals("Mul")) {
			return a*b;
		}
		
		else {
			return a/b;
		}
	}
	
	public static void main(String[] args) {
		//creation of scanner object for taking input from the user
		Scanner scan=new Scanner(System.in);
		
		//Taking input numbers and storing in 2 variables
		System.out.println("Enter the 2 numbers:");
		double x=scan.nextDouble();
		double y=scan.nextDouble();
		
		System.out.println("Enter the operation:(Add,Sub,Mul,Div)");
		String op=scan.next();
		
		double result=calculator(x, y, op);
		
		System.out.println(result);
		
	}
}
