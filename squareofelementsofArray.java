package Arrays;

import java.util.Scanner;

public class squareofelementsofArray {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
        int input = scanner.nextInt();
        int[] originalarray = new int[input];
        int[] result = new int[input];
        
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < input; i++) {
            originalarray[i] = scanner.nextInt();
        }
        
        // Check if the array is sorted
        for (int i = 1; i < input; i++) {
            if (originalarray[i] < originalarray[i - 1]) { //index keeps track of the position in the result array, starting from the last index (n-1).
                System.out.println("Error: Please enter a sorted array.");
                return;
            }
        }
        
        int left = 0, right = input - 1, index = input - 1;
        while (left <= right) {
            int leftSquare = originalarray[left] * originalarray[left];
            int rightSquare = originalarray[right] * originalarray[right];
            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }
        
        System.out.println("Sorted squares:");
        for (int num : result) {
            System.out.print(num + " ");
        }
	}

}
