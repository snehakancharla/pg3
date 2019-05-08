/*
4. Write a program to set up an array of places, Loop round and remove the vowels. Display the new
        words in console
        Input:
        India
        United States
        Germany
        Egypt
        czechoslovakia
        Output:
        Place Name without Vowels:0 Ind
        Place Name without Vowels:1 Untd Stts

        Place Name without Vowels:2 Grmny
        Place Name without Vowels:3 Egypt
        Place Name without Vowels:4 czchslvk
*/






package com.stackroute.pg3;
import  java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

//function to remove vowels in string
public class RemoveVowels {
    static String remVowel(String str)
    {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        List<Character> al = Arrays.asList(vowels);

        StringBuffer bufferObject = new StringBuffer(str);

        for (int i = 0; i < bufferObject.length(); i++) {

            if(al.contains(bufferObject.charAt(i))){
                bufferObject.replace(i, i+1, "") ;
                i--;
            }
        }


        return bufferObject.toString();
    }
    // Driver method to test the above function
    public static void main(String[] args)
    {
        System.out.print("Input:");
        Scanner sc = new Scanner(System.in);
        int vow = sc.nextInt();
        String[] vowellist = new String[vow];
        for(int j = 0; j < vowellist.length;j++)
        {
            System.out.println(j);
            System.out.print("enter the word:");
            Scanner str = new Scanner(System.in);
            //String str = rs.nextLine();
            vowellist[j] = str.next();
            System.out.println("Place name without vowels :"+j+" "+remVowel(vowellist[j]));
        }




    }
}
