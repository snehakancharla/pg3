/*
1. Create a class called StudentMarks, which prompts user for the number of students, reads it
        from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
        grades of each of the students and saves them in an int array called stuGrades. Your program shall
        check that the grade is between 0 and 100 else has to trow an error message.
*/



package com.stackroute.pg3;
import java.util.Scanner;

public class StudentMarks {

    private final int LOWEST_GRADE  = 0;
    private final int HIGHEST_GRADE = 100;

    // student's grades
    private int[]  stuGrades;

    private Scanner numOfStudents;


    public static void main(String[] args)
    {
        StudentMarks stud = new StudentMarks();
        stud.numOfStudents = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = stud.numOfStudents.nextInt();

        stud.run(numStudents);
    }

    private void run(int numStudents)
    {
        if (numStudents <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }
        stuGrades= new int[numStudents];

        double sum = 0;
        int    i   = 0;
        while (i < numStudents)
        {
            System.out.printf("Enter the grade for student %d: ", (i+1));
            int grade = numOfStudents.nextInt();

            // chek if grade is between 0 and 100
            if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE)) {
                stuGrades[i] = grade;
                sum      += grade;
                i++;
                continue;
            }
            System.out.println("Invalid grade, try again...");
        }
        System.out.printf("The average is %f\n", (sum / numStudents));
    }
}
