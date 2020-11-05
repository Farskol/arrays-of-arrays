package com.company;

public class Main {

    public static void main(String[] args) {
        int matrix[][] = new int[10][20];
        int matrixForNumbers [] = new int [10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = (int)(Math.random() * 15);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i <10; i++ ){
            int k = 0;
            for(int j = 0; j < 20; j++){
                if (matrix[i][j] == 5) {
                    k++;
                }
            }
            if (k >= 3){
                matrixForNumbers [i] = i+1;
            }
        }
        System.out.print("Numbers of line with five : ");
        for (int i = 0; i < 10; i++){
            if (matrixForNumbers [i] !=0){
                System.out.print(matrixForNumbers[i] + ", ");
            }
        }
    }
}
