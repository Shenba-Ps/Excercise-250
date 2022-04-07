package com.Excercise;
//Write a Java Program to Sort Names in an Alphabetical Order
import java.util.*;
public class Ex102alphabeticalorder {

        public static void main(String[] args)
        {
            int num;
            String temp;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter number of names you want to enter:");
            num = s.nextInt();
            String names[] = new String[num];
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter all the names:");
            for(int i = 0; i < num; i++)
            {
                names[i] = s1.nextLine();
            }
            for (int i = 0; i < num; i++)
            {
                for (int j = i + 1; j < num; j++)
                {
                    if (names[i].compareTo(names[j])>0)
                    {
                        temp = names[i];
                        names[i] = names[j];
                        names[j] = temp;
                    }
                }
            }
            System.out.print("Names in Sorted Order:");
            for (int i = 0; i < num - 1; i++)
            {
                System.out.print(names[i] + ",");
            }
            System.out.print(names[num - 1]);
        }


}
