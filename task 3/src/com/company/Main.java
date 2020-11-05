package com.company;

import java.util.Scanner;

public class Main {
    public static int getInt (){
        int i = 0;
        boolean d = true;
        Scanner console = new Scanner(System.in);
        while (d){
            if (console.hasNextInt()){
                i = console.nextInt();
                d = false;
            }
            else {
                System.out.print("Error");
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int n = getInt();
        int m = getInt();
        int matrix [][]= new int[n][m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix [j][i] = getInt();
            }
        }
        System.out.println("write k: ");
        int k = getInt();
        System.out.println("write p: ");
        int p = getInt();
        System.out.print("k: ");
        for (int i = 0; i < m;i++){
            System.out.print(matrix[k-1][i]+", ");
        }
        System.out.println("");
        System.out.print("p: ");
        for (int i = 0; i < m;i++){
            System.out.print(matrix[i][p-1]+", ");
        }
    }
}
