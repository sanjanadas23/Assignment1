package Arrays;

import java.util.Scanner;

public class matrixOperations {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrices
        System.out.println("Enter the number of rows and columns for the matrices:");
        int rows1, columns1, rows2, columns2;

        // Input validation for rows and columns
        while (true) {
            try {
                System.out.print("Rows of Matrix 1: ");
                rows1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Columns of Matrix 1: ");
                columns1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Rows of Matrix 2: ");
                rows2 = Integer.parseInt(scanner.nextLine());
                System.out.print("Columns of Matrix 2: ");
                columns2 = Integer.parseInt(scanner.nextLine());

                if (rows1 <= 0 || columns1 <= 0 || rows2 <= 0 || columns2 <= 0) {
                    System.out.println("Rows and columns must be positive integers. Please try again.");
                    continue;
                }

                // Check if the matrices are of the same size for addition and subtraction
                if (rows1 != rows2 || columns1 != columns2) {
                    System.out.println("Warning: Matrices are of different sizes. Operations like addition and subtraction require matrices of the same size.");
                    continue;
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid positive integers.");
            }
        }

        // Create and input the two matrices
        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];

        // Input for the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                while (true) {
                    try {
                        System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                        matrix1[i][j] = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter an integer.");
                    }
                }
            }
        }

        // Input for the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                while (true) {
                    try {
                        System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                        matrix2[i][j] = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter an integer.");
                    }
                }
            }
        }

        // Print both matrices
        System.out.println("Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }

        // Matrix Addition
        System.out.println("Matrix Addition:");
        if (rows1 == rows2 && columns1 == columns2) {
            int[][] additionResult = new int[rows1][columns1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    additionResult[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            // Print Addition Result
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    System.out.print(additionResult[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix Addition is not possible. Matrices must be of the same size.");
        }

        // Matrix Subtraction
        System.out.println("Matrix Subtraction:");
        if (rows1 == rows2 && columns1 == columns2) {
            int[][] subtractionResult = new int[rows1][cols1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    subtractionResult[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }

            // Print Subtraction Result
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    System.out.print(subtractionResult[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix Subtraction is not possible. Matrices must be of the same size.");
        }

        // Matrix Multiplication
        System.out.println("Matrix Multiplication:");
        if (columns1 == rows2) {
            int[][] multiplicationResult = new int[rows1][columns2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    for (int k = 0; k < columns1; k++) {
                        multiplicationResult[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            // Print Multiplication Result
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    System.out.print(multiplicationResult[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible. The number of columns in Matrix 1 must equal the number of rows in Matrix 2.");
        }
	}

}
