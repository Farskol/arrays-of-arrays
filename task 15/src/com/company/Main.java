package com.company;

public class Main {

    public static void main(String[] args) {
        int n = (int)(Math.random()*10);
        int m = (int)(Math.random()*10);
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int)(Math.random()*30);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        int k = matrix [0][0];
        for (int i =0 ; i < n; i++){
            for (int j = 0; j < m; j++){
                if (k < matrix[i][j]){
                    k = matrix[i][j];
                }
            }
        }
        for (int i = 0 ; i < n; i++){
            for (int j = 0; j < m; j++){
                if (matrix [i][j]%2 != 0) {
                    matrix [i][j] = k;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
