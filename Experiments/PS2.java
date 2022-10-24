package com.company;
import java.util.*;
public class PS2 {
    static void printMatrix(int[][] arr) {
        int row, col;
        System.out.print("The array elements are : ");
        for (row = 0; row < 3; row++) {
            System.out.print("\n");
            for (col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + " ");
            }
        }
    }
    static int[][] add(int[][] mat1, int[][] mat2) {
        int row;
        int col;
        int[][] add = new int[3][3];
        for (row = 0; row < 3; row++)
            for (col = 0; col < 3; col++)
                add[row][col] = mat1[row][col] + mat2[row][col];
        return add;
    }
    static int[][] prod(int[][] mat1, int[][] mat2) {
        int row;
        int col;
        int[][] prod = new int[3][3];
        for (row = 0; row < 3; row++)
            for (col = 0; col < 3; col++) {
                prod[row][col] = 0;
                for (int i = 0; i < 3; i++)
                    prod[row][col] += mat1[row][i] * mat2[i][col];
            }
        return prod;
    }
    static int[][] trans(int[][] mat) {
        int row;
        int col;
        int[][] trans = new int[3][3];
        for (row = 0; row < 3; row++)
            for (col = 0; col < 3; col++)
                trans[row][col] = mat[col][row];
        return trans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        System.out.println("Enter the 3x3 matrix elements for 1st matrix : ");
        for (row = 0; row < 3; row++)
            for (col = 0; col < 3; col++)
                mat1[row][col] = scan.nextInt();

        System.out.println("\nEnter the 3x3 matrix elements for 2nd matrix : ");
        for (row = 0; row < 3; row++)
            for (col = 0; col < 3; col++)
                mat2[row][col] = scan.nextInt();

        int[][] res = new int[3][3];
        int choice;
        while (true) {
            System.out.println();
            System.out.println("Welcome to matrix operations calculator");
            System.out.println("1. Addition of two matrices");
            System.out.println("2. Muliplication of two matrices");
            System.out.println("3. Transpose of first matrix");
            System.out.println("4. Transpose of second matrix");
            System.out.println("0. Exit");
            System.out.println("Enter your choice : ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    res = add(mat1, mat2);
                    System.out.println("After add operation");
                    printMatrix(res);
                    break;
                case 2:
                    res = prod(mat1, mat2);
                    System.out.println("After multiply operation");
                    printMatrix(res);
                    break;
                case 3:
                    res = trans(mat1);
                    System.out.println("After transpose operation");
                    printMatrix(res);
                    break;
                case 4:
                    res = trans(mat2);
                    System.out.println("After transpose operation");
                    printMatrix(res);
                    break;
                case 0:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Wrong input, please try again!!");
            }
        }

    }
}
