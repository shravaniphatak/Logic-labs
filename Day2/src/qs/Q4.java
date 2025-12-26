package qs;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence");
		String str = sc.nextLine();
		
		String word [] = str.split(" ");
		
		String result = " ";
	
		
		
		for(int i = 0; i< word.length; i++) {
			String single = word[i];
			String rev = " ";
			
			
			
			for (int j = single.length()-1; j >= 0; j--) {
				rev = rev + single.charAt(j);
				
			}
			result = result + rev + " ";
		
		
		
	}
		
		System.out.println(result);
		sc.close();

	}

	

}
