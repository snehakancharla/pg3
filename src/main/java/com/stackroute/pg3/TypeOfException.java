/*
8. Write a program that will generate exceptions of type NegativeArraySizeException,
        IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
        displaying the message stored in the exception object.

*/




package com.stackroute.pg3;

public class TypeOfException {
    public static void main(String[] args)
    {
        for(int choice = 0; choice<3 ; ++choice)
            try {
                switch(choice) {
                    case 0:
                        int[] a=new int[2];
                        a[3]=24;
                        break;
                    case 1:
                        int[] a1=new int[-3];
                        a1[2]=24;

                        break;
                    case 2:
                        String s=null;
                        int lenght=s.length();
                        break;
                }
            }

            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array index out of bound exception");
            }

            catch (NegativeArraySizeException e)
            {
                System.out.println("Negative array size exception");
            }

            catch (NullPointerException e)
            {
                System.out.println("null pointer exception");
            }
    }
}
