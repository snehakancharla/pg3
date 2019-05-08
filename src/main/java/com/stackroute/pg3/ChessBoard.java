/*
5. Write a program to create a ChessBoard pattern with the help of multidimensional array, where
        WWrepresents white color and BB represents Black color.
        Output:
        My Chess Board
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|

*/




package com.stackroute.pg3;

public class ChessBoard {
    public static void main(String args[])
    {
        String[][] array=new String[8][8];

        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if((i+j)%2==0)
                {   array[i][j]="WW";
                    System.out.print(array[i][j]+" | ");
                }
                else
                {
                    array[i][j]="BB";
                    System.out.print(array[i][j]+" | ");
                }
            }
            System.out.println();
        }
    }
}
