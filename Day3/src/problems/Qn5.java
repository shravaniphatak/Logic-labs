package problems;
import java.util.Scanner;

public class Qn5 {

   
    static String dayOfWeek(int d, int m, int y) {

       
        if (m == 1) {
            m = 13;
            y = y - 1;
        } else if (m == 2) {
            m = 14;
            y = y - 1;
        }

        int q = d;        // day of month
        int k = y % 100;  // year of century
        int j = y / 100;  // century

        
        //formula
        int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

       
        String[] days = {
            "Saturday", "Sunday", "Monday",
            "Tuesday", "Wednesday", "Thursday", "Friday"
        };

        return days[h];
    }

   
    static boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    
    static boolean isValidDate(int d, int m, int y) {

        if (m < 1 || m > 12 || d < 1)
            return false;

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (isLeapYear(y)) {
            daysInMonth[1] = 29;
        }

        return d <= daysInMonth[m - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter date (dd mm yyyy):");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        if (!isValidDate(d, m, y)) {
            System.out.println("Invalid date");
        } else {
            System.out.println(dayOfWeek(d, m, y));
        }

        sc.close();
    }
}
