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
        int matrix [][]= new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix [i][j] = getInt();
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(matrix[i][i]+", ");
        }
    }
}
