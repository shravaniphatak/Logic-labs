package problems;
import java.util.Scanner;

class passwordvalidator {  // class creation

    static boolean isValid(String user, String pwd) { // used static since storing data is not required
        if (pwd.length() < 8 || pwd.length() > 20) {
            return false;
        }

        boolean hasupper = false;
        boolean haslower = false;
        boolean hasdigit = false;
        boolean hasspecial = false;

        String specialChars = "!@#$%^&*"; // need to mention since (we only need to check wiht these special characters out all the other characters)

        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);

            if (ch == ' ') {
                return false;
            } else if (Character.isUpperCase(ch)) {
                hasupper = true;
            } else if (Character.isLowerCase(ch)) {
                haslower = true;
            } else if (Character.isDigit(ch)) {
                hasdigit = true;
            } else if (specialChars.indexOf(ch) != -1) {
                hasspecial = true;
            }
        }

        if (pwd.toLowerCase().contains(user.toLowerCase())) {
            return false;
        } else {
            return hasupper && haslower && hasdigit && hasspecial;
        }
    }

    static String feedback(String pwd, String user) { // method for feedbacks 
        String msg = "";

        if (pwd.length() < 8 || pwd.length() > 20) {
            msg += "- Password length should be between 8 and 20.\n";
        }

        boolean hasupper = false;
        boolean haslower = false;   
        boolean hasdigit = false;
        boolean hasspecial = false;

        String specialChars = "!@#$%^&*";

        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);

            if (Character.isUpperCase(ch))
                hasupper = true;
            else if (Character.isLowerCase(ch))
                haslower = true;
            else if (Character.isDigit(ch))
                hasdigit = true;
            else if (specialChars.indexOf(ch) != -1)
                hasspecial = true;
        }

        if (!hasupper) msg += "- Add at least one uppercase letter.\n";
        if (!haslower) msg += "- Add at least one lowercase letter.\n";
        if (!hasdigit) msg += "- Add at least one digit.\n";
        if (!hasspecial) msg += "- Add more special characters.\n";

        if (pwd.contains(" ")) {
            msg += "- Password must not contain spaces.\n";
        }

        if (pwd.toLowerCase().contains(user.toLowerCase())) {
            msg += "- Avoid using parts of your name.\n";
        }

        return msg;
    }
}

public class Qn8 { //main class
    public static void main(String[] args) { // main method
        Scanner sc = new Scanner(System.in);

        System.out.println("enter username:");
        String user = sc.nextLine();

        System.out.println("Enter password");
        String pwd = sc.nextLine();
        
        if (passwordvalidator.isValid( user,  pwd )){ // direct using classname.methodname as static used
        	System.out.println("valid pwd");
        }
        else
        	System.out.println("Invalid password");
        
        
        System.out.println("Feedback");
        System.out.println(passwordvalidator.feedback(pwd, user));
        
        sc.close();
    }
    
}
