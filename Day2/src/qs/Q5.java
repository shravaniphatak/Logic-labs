package qs;
import java.util.Scanner;


public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		int arr [] = new int[n];
		
		
		
		System.out.println("Enter the values:");
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		int max2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] > max) {
				max = arr[i];
				max2 = max;
			}
			else if(arr[i] > max2 && arr[i] != max) {
				max2 =arr[i];
			}
		}
		
		System.out.println(max2);
		sc.close();
		
		
		

	}

}
