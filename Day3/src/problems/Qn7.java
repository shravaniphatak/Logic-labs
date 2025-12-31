package problems;
import java.util.Scanner;

class matrix{
	public void add(int A[][], int B[][], int r, int c) {
		System.out.println("sum");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.println(A[i][j] + B[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
	}
public void subtract(int A[][], int B[][], int r, int c) {
	System.out.println("subtract");
	for(int i = 0; i < r; i++) {
		for(int j = 0; j < c; j++) {
			System.out.println(A[i][j] - B[i][j] + " ");
			
		}
		System.out.println();
	}
	
}

public void Transpose(int A[][], int r, int c) {
	System.out.println("Transpose:");
    for (int j = 0; j < c; j++) {
        for (int i = 0; i < r; i++) {
            System.out.println(A[i][j] + " ");
        }
        System.out.println();
    }
}

public void multiply(int A[][], int B[][], int r, int c) {
	 System.out.println("Multiply:");

     int[][] C = new int[r][c];

     /*
      * Triple loop explanation:
      * i → row of A
      * j → column of B
      * k → common dimension (column of A / row of B)
      */
     for (int i = 0; i < r; i++) {
         for (int j = 0; j < c; j++) {
             for (int k = 0; k < c; k++) {
                 C[i][j] += A[i][k] * B[k][j];
             }
             System.out.println(C[i][j] + " ");
         }
         System.out.println();
     }
}
	
}
public class Qn7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int r =sc.nextInt();
		int c = sc.nextInt();
		
		if (r < 2 || r > 10 || c < 2 || c > 10) {
            System.out.println("Not in range");
            
            
        }
		
		int A [][] = new int [r][c];
		int B [][] = new int [r][c];
		
		  
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

       
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        
        int choice = sc.nextInt();

        matrix m = new matrix();

        switch (choice) {
            case 1:
            m.add(A, B, r, c);
            break;
            
            case 2: 
            m.subtract(A, B, r, c); 
            break;
            
            case 3:
            m.multiply(A, B, r, c); 
            break;
            
            case 4: m.Transpose(A, r, c); 
            break;
            
            case 5: 
            System.out.println("Exit");
            break;
            
            default:
            System.out.println("Invalid choice");
        }
        sc.close();	
    }
			

	}


