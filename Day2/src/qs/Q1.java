// Two ways to solve the problem 

// 1st way
package qs;
import java.util.Scanner;

class TemperatureCalculator { // Class creation
	
	float ctof(float n) {   // method creation
		return  (n * 1.8f) + 32;
		
	
    }

    float ftoc(float n) {
    	return (n -32) / 1.8f;
    }
}

public class Q1 { // this is main class

	public static void main(String[] args) { // this is main method
		
		Scanner sc = new Scanner(System.in);
		
		TemperatureCalculator T = new TemperatureCalculator(); // object creation of the above class created
		
		System.out.println("Choice:");
		String str = sc.nextLine();
		
		System.out.println("value : ");
		float n = sc.nextFloat();
		
		if (str.equalsIgnoreCase("C to F")) {
			float value = T.ctof(n); // method calling
			System.out.println(value + "F");
			
		} 
		
		else if(str.equalsIgnoreCase("F to C")) {
			float value = T.ftoc(n); // method calling
			System.out.println(value + "C");
			
			
		}
		else 
			System.out.println("Invalid input");
		
		sc.close();
		
		

	}

}

// 2nd way


/*
package qs;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choice:");
		String str = sc.nextLine();
		System.out.println("value : ");
		float n = sc.nextFloat();
		
		if (str.equalsIgnoreCase("C to F")) {
			float value = (n * 1.8f) + 32;
			System.out.println(value + "F");
			
		} 
		
		else if(str.equalsIgnoreCase("F to C")) {
			float value = (n-32) / 1.8f;
			System.out.println(value + "C");
			
			
		}
		else 
			System.out.println("Invalid input");
		
		sc.close();
		
		

	}

}*/
