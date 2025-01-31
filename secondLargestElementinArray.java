package Arrays;

import java.util.Scanner;

public class secondLargestElementinArray {
	public static void main(String[] args) {
		

		  Scanner scanner = new Scanner(System.in);

		  // Size of the array
		  System.out.println("Enter size of the array: ");
		  int sizeOfArray = scanner.nextInt();

		  // array declaration
		  int[] array = new int[sizeOfArray];

		  // array initialization
		  for (int i = 0; i < array.length; i++) {
		   System.out.println("Enter element " + (i + 1) + ": ");
		   array[i] = scanner.nextInt();
		  }

		  // printing the array
		  System.out.println("\nArray elements are: ");
		  for (int i : array) {
		   System.out.print(i + " ");
		  }

		  int largestElement = array[0];
		  int secondLargestElement = array[1];


		  for (int i = 0; i < array.length; i++) {
		   if(array[i] > largestElement)
		   {
		    secondLargestElement = largestElement;
		    largestElement = array[i];
		   }
		   
		   if(array[i] < largestElement && array[i] > secondLargestElement)
		   {
		    secondLargestElement = array[i];
		   }
		  }
		  
		  System.out.println("\n\nSecond Largest element is: "+secondLargestElement);
		  scanner.close();
		 }
		}

