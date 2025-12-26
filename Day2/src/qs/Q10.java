package qs;
import java.util.Scanner;

class ATM { // created a atm class
	float currentBalance; // this variable i have declared outside the method to use it in other methods as well
	
	void balance(float n) { // method
	 currentBalance = n;
		
	}
	
	void checkbalance() { // method
		System.out.println("your current balance: " + currentBalance);
	}
	
	 void deposit(float amount) { // method
	 currentBalance += amount;
	 System.out.println("Amount deposited: " + amount);
     System.out.println("New Balance: " + currentBalance);
	 }
	 
	 void withdraw(float amount) { //method
		 if(amount < currentBalance) {
		 currentBalance -= amount;
		 System.out.println("Amount to bewithdrawn: " + amount);
	     System.out.println("New Balance: " + currentBalance);
		 } 
		 else {
			 System.out.println("blanace low!");
		 }
		 
	 } 
	
	
	
}

public class Q10 { // main class

	public static void main(String[] args) { // main method
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your current Balnace: ");
		float n = sc.nextInt();
		
		ATM machine = new ATM(); // object created from the class atm
		machine.balance (n); // called balance method to set initial balance
		
		int choice;
		
		do {
			System.out.println("enter option: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            
		
		
		switch (choice) {
        case 1:
            machine.checkbalance();
            break;
        case 2:
            System.out.print("Enter amount to deposit: ");
            float depositAmount = sc.nextFloat();
            machine.deposit(depositAmount);
            break;
        case 3:
            System.out.print("Enter amount to withdraw: ");
            float withdrawAmount = sc.nextFloat();
            machine.withdraw(withdrawAmount);
            break;
        case 4:
            System.out.println("Exiting Thank you!");
            break;
        default:
            System.out.println("Invalid choice! Try again.");
		}
		
    } while (choice != 4);
    
 
		
		
		sc.close();



	}

}
