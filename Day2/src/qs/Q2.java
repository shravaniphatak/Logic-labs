package qs;
import java.util.Scanner;

class percentage { // class
	float add(int arr[]) { // method1 
		
		int total = 0;
		for(int i = 0; i < 5; i++) {
			total = total + arr[i];
		}
		
		return total;
}
		
float calculate( int total){ // method 2
		
		return  total/500.f * 100f;
}

char G(float per) { // method 3
	if(per >= 90) {
		return 'A';
	}
	else if(per >= 75) {
		return 'B';
	}
	else if (per >= 60) {
		return 'C';
		
	}
	else if(per >= 40) {
		return 'D';
	} else 
		return 'F';
   }
}

public class Q2 { // main class

	public static void main(String[] args) { // main method
		
		Scanner sc = new Scanner(System.in); 
		percentage P = new percentage(); // object creation
		
		int arr [] = new int[5];
		System.out.println("Enter marks:");
		for(int i = 0; i < 5 ; i++) {
		arr[i] = sc.nextInt();
		}
		
		float total = P.add(arr);
		float per = P.calculate((int)total);
		char Grade = P.G(per);
		
		
		System.out.println( total);
		System.out.println( per);
		System.out.println( Grade);	
		sc.close();
		
}
		
		
		
		
		
		
		
		

	}


