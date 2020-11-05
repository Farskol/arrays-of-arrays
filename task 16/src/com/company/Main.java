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
                if (i > 2) {
                    flag = false;
                }
                else {
                    System.out.println("Error try again");
                }
            } else {
                System.out.println("Error try again");
            }
        }
        return i;
    }
    public static int [][] Sorter1( int newMatrix [][]){
        int k = 1;
        for (int n = 0; n < newMatrix.length-1; n+=4 ) {
            int j = n;
            System.out.println(j);
            for (int i = 0; i < newMatrix.length / 2; i++) {
                if (j >= 0) {
                    newMatrix[j][i] = k;
                } else {
                    newMatrix[newMatrix.length - (j * -1)][i] = k;
                }
                j--;
                k++;
            }
            j++;
            for (int i = newMatrix.length / 2; i < newMatrix.length; i++) {
                if (j >= 0) {
                    newMatrix[j][i] = k;
                } else {
                    newMatrix[newMatrix.length - (j * -1)][i] = k;
                }
                j++;
                k++;
            }
            for (int i = newMatrix.length - 1; i >= newMatrix.length / 2; i--) {
                if (j >= 0) {
                    newMatrix[j][i] = k;
                } else {
                    newMatrix[newMatrix.length - (j * -1)][i] = k;
                }
                j++;
                k++;
            }
            j--;
            for (int i = newMatrix.length / 2 - 1; i >= 0; i--) {
                if (j >= 0) {
                    newMatrix[j][i] = k;
                } else {
                    newMatrix[newMatrix.length - (j * -1)][i] = k;
                }
                j--;
                k++;
            }
            j += 2;
            for (int i = newMatrix.length - 1; i >= newMatrix.length / 2; i--) {
                if (j < newMatrix.length) {
                    newMatrix[j][i] = k;
                } else {
                    newMatrix[j - newMatrix.length][i] = k;
                }
                j--;
                k++;
            }
            j++;
            for (int i = newMatrix.length / 2 - 1; i >= 0; i--) {
                if (j < newMatrix.length) {
                    newMatrix[j][i] = k;
                } else {
                    newMatrix[j - newMatrix.length][i] = k;
                }
                j++;
                k++;
            }
            for (int i = 0; i < newMatrix.length / 2; i++) {
                if (j < newMatrix.length) {
                    newMatrix[j][i] = k;
                } else {
                    newMatrix[j - newMatrix.length][i] = k;
                }
                j++;
                k++;
            }
            j--;
            for (int i = newMatrix.length / 2; i < newMatrix.length; i++) {
                if (j < newMatrix.length) {
                    newMatrix[j][i] = k;
                } else {
                    newMatrix[j - newMatrix.length][i] = k;
                }
                j--;
                k++;
            }
        }
        return newMatrix;
    }
    public static void main(String[] args) {
int n = getInt();
int matrix[][] = new int[n][n];
if (n%2 == 0){
matrix = Sorter1(matrix);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println("");
    }
}
else {

}
    }
}
