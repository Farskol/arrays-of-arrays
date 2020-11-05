package com.company;

public class Main {
    static int [] Sorter (int n []) {
        for(int j = 1; j< n.length; j++) {
            for (int i = 0; i < n.length - j; i++) {
                if (n[i] < n[i + 1]) {
                    int f = n[i];
                    n[i] = n[i + 1];
                    n[i + 1] = f;
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int n = (int)(Math.random()*10);
        int matrix[][] = new int[n][n];
        int matrixForNumbers [] = new int [n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrixForNumbers [j] = matrix [i][j];
            }
            matrixForNumbers = Sorter(matrixForNumbers);
            for (int j = 0; j < n; j++){
                matrix [i][j] = matrixForNumbers [j];
            }
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
