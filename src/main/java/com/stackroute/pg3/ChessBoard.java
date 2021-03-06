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

        for(int rowvalue=0;rowvalue<8;rowvalue++)
        {
            for(int columnvalue=0;columnvalue<8;columnvalue++)
            {
                if((rowvalue+columnvalue)%2==0)
                {   array[rowvalue][columnvalue]="WW";
                    System.out.print(array[rowvalue][columnvalue]+" | ");
                }
                else
                {
                    array[rowvalue][columnvalue]="BB";
                    System.out.print(array[rowvalue][columnvalue]+" | ");
                }
            }
            System.out.println();
        }
    }
}
