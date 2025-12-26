package qs;
import java.util.Scanner;


public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements to add ");
		int n = sc.nextInt();
		
		int even = 0;
		int odd = 0;
		
		System.out.println("Enter the numbers: ");
	
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			if(num % 2 == 0) {
				even += num;
			}
		else {
			odd += num;
				
			}
			
		}
		  System.out.println( "even sum: " + even);
	       System.out.println( "odd sum: " + odd);

	        sc.close();
		
		
		
		
		

	}

}
