package com.Excercise;
import java.util.Scanner;

public class Ex29areaoftriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the width of the triangle");
        double w=scan.nextDouble();
        System.out.println("enter the height of the triangle");
        double h=scan.nextDouble();
        double area=w*h/2;
        System.out.println(area);
    }
}
