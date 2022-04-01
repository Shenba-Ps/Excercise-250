package com.Excercise;
import java.util.Scanner;
//Java Program to find volume of Prism

public class Ex33volumeofprism {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the base");
        double b= scan.nextDouble();
        System.out.println("enter the height");
        double h=scan.nextDouble();
        double area=b*h;
        System.out.println(area);
    }
}
