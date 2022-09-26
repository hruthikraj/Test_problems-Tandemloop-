public class Program4 {

	
	static void mulCount(int []arr) {
		
		int []numbers= {1,2,3,4,5,6,7,8,9};
		int count=0;
		
		for (int i = 0; i <= numbers.length-1; i++) {
			for (int j = 0; j <= arr.length-1; j++) {
				
				//checking whether if multiple or not
				if (arr[j]%numbers[i]==0) {
					count++;
				}
			}
			System.out.print(numbers[i]+":"+count+" ");
			count=0;
			}
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,8,9,12,46,76,82,15,20,30};
		mulCount(arr);
	}
}
