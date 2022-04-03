package com.Excercise;
import java.util.Scanner;
//Write a Java program to display the multiplication table of a given integer

public class Ex62multiplicationtable {

    public static void main(String[] args)

        {
            int j,num;
            {
                System.out.print("Enter number of terms : ");
                Scanner in = new Scanner(System.in);
                num = in.nextInt();

                System.out.println ("\n");
                for(j=0;j<=num;j++)

                    System.out.println(num+" X "+j+" = " +num*j);
            }
        }

}
