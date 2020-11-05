package com.company;

public class Main {

    public static void main(String[] args) {
        int n = (int)(Math.random()*10);
        int m = (int)(Math.random()*10);
        int k = 0;
        int matrix[][] = new int[n][m];
        System.out.println("m: " + m);
        System.out.println("n : " + n);
        for (int i = 0; i < n; i++) {
            if (k < m) {
                if (k < n) {
                    k++;
                }
            }
            for (int j = 0; j < k; j++) {
                matrix[i][j] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
