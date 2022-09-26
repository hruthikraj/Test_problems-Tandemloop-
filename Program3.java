import java.util.Scanner;

public class Program3 {

	static void numPrint(int n) {
        int oddNum=1;
		
        //if n is even number decrease it by 1
        if(n%2==0) {
			n=n-1;
		}
		
        for (int i = 0; i <n; i++) {
			System.out.print(oddNum+" ");
			oddNum+=2;
			}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int inp=scan.nextInt();
		numPrint(inp);
	}
}
