package problems;

import java.util.Scanner;

class gradebook{
	
	public void printAll(String name[], int grades[], int n) {
	    System.out.print("All: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(name[i] + "(" + grades[i] + ")");
	        if (i != n - 1) {
	            System.out.print(", ");
	        }
	    }
	    System.out.println();
	}
	
	public void topper(int grades[], String name[], int n) {
		int max =0;
		
		for(int i = 0 ; i < n; i++) {
			if(grades[i] > max) {
				max = grades[i];
			}
		}
		System.out.println("Topper:" + "(" + grades[max] + ")");
		
		
	}
	
	public void average(int grades[],  int n) {
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum = sum + grades[i];
		}
		double avg = sum / n;
		 System.out.print(avg);
		
		
	}
	
	public String search(String name[], int grades[],String ent, int n) {
		
		for(int i = 0; i < n; i++) {
			if ( name[i].equalsIgnoreCase(ent)) {
				 return "Found: " + name[i] + "(" + grades[i] + ")";
				
			}
			
			
		}
		return "not found";
	   
		
	}
	
public String curve(int grades[], int n) {
	for (int i = 0; i < n ; i++) {
		grades[i]  = grades[i] + 5;
		if(grades[i] > 100) {
			grades[i] = 100;
		}
		
		
	}
	return "curved by 5";
}
	
}

public class Qn2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		gradebook G = new gradebook();
		
		System.out.println("enter number of students");
		int n = sc.nextInt();
		sc.nextLine(); 
		
		
		String name[] = new String[n];
		int grades[] = new int[n];

		// take all names first
		System.out.println("Enter names of students:");
		for (int i = 0; i < n; i++) {
		    name[i] = sc.nextLine();
		}

		// take all marks next
		System.out.println("Enter marks of students:");
		for (int i = 0; i < n; i++) {
		    grades[i] = sc.nextInt();
		}
       
		
		while(true) {
			   System.out.println("1. Print all");
	           System.out.println("2. Print topper");
	           System.out.println("3. Class average");
	           System.out.println("4. Search by name");
	           System.out.println("5. Curve grades");
	           System.out.println("6. Exit");
	           
	           int choice = sc.nextInt();
	           if (choice < 1 || choice > 6) {
	                System.out.println("Invalid choice");
	                continue;
	            }
	           switch(choice) {
	           case 1:
	        	   G.printAll(name, grades, n);
	        	   break;
	        	   
	           case 2:
                   G.topper( grades,name, n);
                   break;
	           case 3:
                   G.average(grades, n);
                   break;
	           case 4:
                   System.out.println("Enter name to search:");
                   String ent = sc.nextLine();

                   String result = G.search(name, grades,ent, n);
                   System.out.println(result);
                   break;
	           case 5:
	        	   String cur = G.curve(grades, n);
	        	   System.out.println("Curved marks:" + cur);
	        	   
	           case 6:
                   System.out.println("Exiting...");
                   sc.close();
	           }
		}
		
		

	}

}
