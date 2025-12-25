package Practice;
import java.util.Scanner;

public class Q5string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word: ");
        String str = sc.nextLine();

        String rev = "";

        
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                rev = rev + ch;
            }
        }

        String result = "";
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result = result + rev.charAt(index);
                index++;
            } else {
                result = result + ch; 
            }
        }
        
        

        System.out.println("Output: " + result);
        sc.close();
    }
}
