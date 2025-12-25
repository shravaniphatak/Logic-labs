package Practice;
import java.util.Scanner;


public class Q3Prime {

    public static boolean IfPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int num = sc.nextInt();
        

        if (IfPrime(num)) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime");
        }
        sc.close();
    }
}
