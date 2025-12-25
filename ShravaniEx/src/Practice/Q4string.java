package Practice;
import java.util.Scanner;

public class Q4string {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String str = sc.nextLine();

	        int[] freq = new int[26];

	     
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                freq[ch - 'a']++;
	            }
	        }

	        
	        int max = 0;
	        for (int i = 0; i < 26; i++) {
	            if (freq[i] > max) {
	                max = freq[i];
	            }
	        }

	       
	        for (int f = max; f >= 1; f--) {
	            for (int i = 0; i < 26; i++) {
	                if (freq[i] == f) {
	                    System.out.print((char)(i + 'a') + ":" + freq[i] + " ");
	                }
	            }
	        }

	        sc.close();
		

	}

}
