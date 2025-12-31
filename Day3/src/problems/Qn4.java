package problems;

import java.util.Scanner;


class ATM { // created a atm class
	static float currentBalance; // this variable i have declared outside the method to use it in other methods as well (instance variable)
	static int currentPin;

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
		 
		 void changePin(int oldPin, int newPin) {
			    if (oldPin == currentPin) {
			        currentPin = newPin;
			        System.out.println("PIN changed successfully!");
			    } else {
			        System.out.println("Incorrect current PIN!");
			    }
			}

		
		
	}
	
	public class Qn4 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your current Balnace: ");
		float n = sc.nextInt();
		
		System.out.println("Enter current pin: ");
		int P = sc.nextInt();
		ATM.currentPin = P;

		
		ATM machine = new ATM(); // object created from the class atm
		machine.balance (n); // called balance method to set initial balance
		
		int choice;
		
		do {
			System.out.println("enter option: ");
           
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Change Pin");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            
		
		
		switch (choice) {
      
        case 1:
            System.out.print("Enter amount to deposit: ");
            float depositAmount = sc.nextFloat();
            machine.deposit(depositAmount);
            break;
        case 2:
            System.out.print("Enter amount to withdraw: ");
            float withdrawAmount = sc.nextFloat();
            machine.withdraw(withdrawAmount);
            break;
        case 3:
            machine.checkbalance();
            break;
            
        case 4:
        	System.out.print("Enter current pin again: ");
        	int oldPin = sc.nextInt();
        	System.out.print("Enter new pin: ");
        	int newpin = sc.nextInt();
        	machine.changePin(oldPin, newpin);
        	break;
        	
        case 5:
            System.out.println("Exiting Thank you!");
            break;
        default:
            System.out.println("Invalid choice! Try again.");
		}
		
    } while (choice != 4);
    
 
		
		
		sc.close();


	}

}
