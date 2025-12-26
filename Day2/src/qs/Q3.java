package qs;

public class Q3 {

	public static void main(String[] args) {
		char nums[][] = new char[4][];
        nums[0] = new char[1];
        nums[1] = new char[2];
        nums[2] = new char[3];
        nums[3] = new char[4];
        

        for (int i = 0; i <4; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = '*';
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
	}

}
