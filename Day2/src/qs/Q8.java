package qs;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a sentence:");
	        String sentence = sc.nextLine();

	        String[] words = sentence.split(" ");
	        boolean[] visited = new boolean[words.length];

	        for (int i = 0; i < words.length; i++) {

	            if (visited[i] == true)
	                continue;

	            int count = 1;

	            for (int j = i + 1; j < words.length; j++) {
	                if (words[i].equals(words[j])) {
	                    count++;
	                    visited[j] = true;
	                }
	            }
	            System.out.println(words[i]+ " : " + count);

	}
	        sc.close();

}
}