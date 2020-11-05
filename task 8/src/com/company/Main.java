package com.company;

import java.util.Scanner;

public class Main {
    public static int getInt() {
        int i = 0;
        boolean flag = true;
        while (flag) {
            Scanner console1 = new Scanner(System.in);
            if (console1.hasNextInt()) {
                i = console1.nextInt();
                flag = false;
            } else {
                System.out.println("Error");
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.print("Write size of matrix: n = ");
        int n = getInt();
        System.out.print("m = ");
        int m = getInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = j + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("write number of column what you want relocate");
        System.out.print("first number : ");
        int firstNumber = getInt()-1;
        System.out.print("second number : ");
        int secondNumber = getInt()-1;
        int matrixForRelocate [] = new int [n];
        for (int i = 0; i < n; i++){
            matrixForRelocate [i] = matrix [i][firstNumber];
        }
        for (int i = 0; i < n; i++){
            matrix [i][firstNumber] = matrix [i][secondNumber];
        }
        for (int i = 0; i < n; i++){
            matrix [i][secondNumber] = matrixForRelocate [i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}