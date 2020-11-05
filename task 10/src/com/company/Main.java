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
        double matrix[][] = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.random() * 20-10;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.print("positive numbers of general diagonal: " );
        for (int i = 0; i < n; i++){
            if (matrix [i][i]>0){
                System.out.print(matrix [i][i] + ", ");
            }
        }
    }
}
