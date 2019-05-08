/*
7. Create a class with a main( ) that throws an object of class Exception inside a try block.
        a. Give the constructor for Exception a String argument.
        b. Catch the exception inside a catch clause and print the String argument.
        c. Add a finally clause and print a message to prove you were there.
*/



package com.stackroute.pg3;

import  java.util.Scanner;

class someMyexception extends Exception {
    public someMyexception(String str)
    {

        System.out.println(str);


    }
}


public class TryCatchDemo {
    public static void main(String ar[]) {
        int number,number1;
        System.out.println("Enter Number...");
        Scanner scanner = new Scanner(System.in);



        try {
            number = scanner.nextInt();
            number1=scanner.nextInt();
            int result;
            System.out.println(result=number+number1);
        }
        catch (Exception e) {
            someMyexception illegalInput = new someMyexception("Don't enter a string ...(Enter Integer Only)");

        }



        finally {
            System.out.println("Inside finally");
        }
    }

}
