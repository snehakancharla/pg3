/*2. Write a program to compute the addition of two matrix, Read the number of rows and columns
        as input, also the values of each matrix
        Output:
        Input number of rows of matrix: 3
        Input number of columns of matrix: 2
        Input elements of first matrix: 1 2 3 4 5 6
        Input the elements of second matrix: 9 8 7 6 5 4
        Sum of the matrices:-
        10 10
        10 10
        10 10*/


package com.stackroute.pg3;
import java.util.Scanner;
public class AddTwoMatrix {
    public static void main(String args[])
    {
        int rowNumber, columnNumber, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of rows of matrix");
        rowNumber = in.nextInt();
        System.out.println("Input number of columns of matrix");
        columnNumber  = in.nextInt();

        int first[][] = new int[rowNumber][columnNumber];
        int second[][] = new int[rowNumber][columnNumber];
        int sum[][] = new int[rowNumber][columnNumber];

        //taking input for first matrix
        System.out.println("Input elements of first matrix");

        for (c = 0; c < rowNumber; c++)
            for (d = 0; d < columnNumber; d++)
                first[c][d] = in.nextInt();

            //taking input for second matrix
        System.out.println("Input elements of second matrix");

        for (c = 0 ; c < rowNumber ; c++)
            for (d = 0 ; d < columnNumber ; d++)
                second[c][d] = in.nextInt();

        for (c = 0; c < rowNumber; c++)
            for (d = 0; d < columnNumber; d++)
                sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
        //sum of matrix
        System.out.println("Sum of the matrices:");

        for (c = 0; c < rowNumber; c++)
        {
            for (d = 0; d < columnNumber; d++)
                System.out.print(sum[c][d]+"\t");

            System.out.println();
        }
    }
}

