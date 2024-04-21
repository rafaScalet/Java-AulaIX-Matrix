package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner in = new Scanner(System.in);

        System.out.println("Provide the numbers: ");
        for(int row = 0; row < matrix[0].length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = in.nextInt();
            }
        }
        in.close();

        System.out.println("Main Diagonal: ");
        for(int indx = 0; indx < matrix[0].length; indx++){
            System.out.println(matrix[indx][indx]);
        }

        System.out.println("Secundary Diagonal: ");
        for(int indx = 0; indx < matrix[0].length; indx++){
            System.out.println(matrix[indx][(matrix[0].length - 1) - indx]);
        }
    }
}
