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
                System.out.println("Error");
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
	for (int i = 0; i < m; i+=2){
	    if (matrix[0][i] > matrix[n-1][i]){
	        for (int j = 0; j < n; j++){
	            System.out.print(matrix[j][i]+", ");
            }
	        System.out.println("");
        }
    }
    }
}
