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
                if (i % 2 ==0) {
                    d = false;
                }
                else {
                    System.out.println("Error");
                }
            }
            else {
                System.out.println("Error");
            }
        }
        return i;
    }
    public static void main(String[] args) {
	int n = getInt();
	int matrix [][] = new int[n][n];
	for (int i = 0; i < n/2; i++){
	    for (int j = i; j < n-i; j++){
	        matrix [i][j]=1;
        }
    }
        for (int i = n/2; i < n; i++){
            for (int j = n-i-1; j < i+1; j++){
                matrix [i][j]=1;
            }
        }
        for (int i=0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println("");
        }
    }
}
