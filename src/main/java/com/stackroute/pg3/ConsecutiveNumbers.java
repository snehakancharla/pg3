
/*6. Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
        assume the digits are a string and use split()
        Input: 98,96,95,94,93
        Output: 98,96,95,94,93 non consecutive numbers
        Input: 54,53,52,51,50,49,48
        Output : 54,53,52,51,50,49,48 are consecutive numbers
        Input: 1,2,3,4,5,6,6
        Output: 1,2,3,4,5,6,6 non consecutive numbers*/

package com.stackroute.pg3;
import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String args[]) {
        String s = "";

        System.out.println("Enter the input numbers");
        Scanner scanner = new Scanner(System.in);

        s = scanner.next();

        String[] array = s.split(",");
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        boolean check=true,check1=true;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) == 1){
                check=false;
            }
                else if((arr[i + 1] - arr[i]) == -1) {
                check1=false;
            } else {

                break;
            }
        }
        if ( check==false && check1==true)
            System.out.println(s + "are consecutive numbers");
        else if( check1==false && check==true){
            System.out.println(s + "are consecutive numbers");
        }
        else if(check==false && check1==false){
            System.out.println(s + "are non consecutive numbers");
        }
        else
            System.out.println(s + "are non consecutive numbers");
    }
}
