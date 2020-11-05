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
        double matrix[][] = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Math.random() * 10;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        double matrixForSum [] = new double[m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrixForSum [i] += matrix [j][i];
            }
        }
        double k = matrixForSum [0];
        for (int i = 0; i < m-1; i++){
            if (k < matrixForSum [i+1]){
                k = matrixForSum [i+1];
            }
        }
        System.out.print("Summa of colums is: ");
        for (int i = 0; i < m; i++){
            System.out.print(matrixForSum[i]+", ");
        }
        System.out.println("");
        System.out.println("the more summa is: " + k);

    }
}
