import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] numArr = new int[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter an integer: ");
			numArr[i] = s.nextInt();
		}
		
		System.out.print("Product of the five integers: ");
		int value = findProduct(numArr);
		System.out.print(String.valueOf(value));

	}
	
	public static int findProduct(int[] nums) {
		if(nums.length > 1) {
			int[] newNums = new int[nums.length-1];
			for (int i = 0; i < nums.length-1; i++) {
				if (i == 0) {
					newNums[i] = nums[i]*nums[nums.length-1];
				}
				else {
					newNums[i] = nums[i];
				}
			}
			return findProduct(newNums);
		}
		else {
			return nums[0];
		}
	}

}
