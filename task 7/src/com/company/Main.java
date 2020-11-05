package com.company;

import java.util.Scanner;

public class Main {
    public static int getInt (){
        int i = 0;
        Scanner console = new Scanner(System.in);
                i = console.nextInt();
        return i;
    }
    public static void main(String[] args) {
        int n = getInt();
        double matrix [][] = new double[n][n];
        int k = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix [i][j] = (Math.pow((i+1),2) - Math.pow((j+1),2))/n;
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
              if (matrix [i][j] > 0){
                  k++;
              }
            }
        }
        for (int i=0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println("");
        }
        System.out.print("positive numbers is: "+ k);
    }
}
