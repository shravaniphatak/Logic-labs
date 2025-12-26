package Practice;
import java.util.Scanner;

public class Q1string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a word: ");
		String str = sc.nextLine();
		String rev = " ";
		
		
		
		for(int i = str.length()-1; i >= 0; i--)
		{
		  char ch = str.charAt(i);
		  if(ch >= 'a' && ch <= 'z') {
		rev =  rev+ str.charAt(i);
		  }
			
		}
		
		System.out.println("Reversed String" + rev);
		
		sc.close();
	}
	

}
