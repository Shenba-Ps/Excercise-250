package com.Excercise;
import java.util.Scanner;
//Write a Java Program to Search Key Elements in an Array
public class Ex104findelement {
    public static void main(String[] args)
        {
            int num, x, flag = 0, i = 0;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter no. of elements you want in array:");
            num = s.nextInt();
            int a[] = new int[num];
            System.out.println("Enter all the elements:");
            for(i = 0; i < num; i++)
            {
                a[i] = s.nextInt();
            }
            System.out.print("Enter the element you want to find:");
            x = s.nextInt();
            for(i = 0; i < num; i++)
            {
                if(a[i] == x)
                {
                    flag = 1;
                    break;
                }
                else
                {
                    flag = 0;
                }
            }
            if(flag == 1)
            {
                System.out.println("Element found at position:"+(i + 1));
            }
            else
            {
                System.out.println("Element not found");
            }
        }

}
