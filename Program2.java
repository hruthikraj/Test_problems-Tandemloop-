import java.util.Scanner;

public class Program2 {

	static void oddPrint(int n) {
		int oddNum=1;
		
		for (int i = 0; i <n; i++) {
			System.out.print(oddNum+" ");
			oddNum+=2;
			}
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int inp=scan.nextInt();
		oddPrint(inp);
	}
}
