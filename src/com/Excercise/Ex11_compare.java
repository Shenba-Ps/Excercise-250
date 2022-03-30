package com.Excercise;
import java.util.*;
public class Ex11_compare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("enter num1");
        num1 = scan.nextInt();
        System.out.println("enter num2");
        num2 = scan.nextInt();
        if (num1 == num2) {
            System.out.println("shenba");
        }
        if (num1 != num2) {
            System.out.println("not equals");
        }
        if (num1 > num2) {
            System.out.println("greater");
        }
        if (num1 < num2) {
            System.out.println("lesser");
        }
        if (num1 >= num2) {
            System.out.println("greater or equals");
        }
        if (num1 <= num2) {
            System.out.println("lesser or equal");
        }
    }
}
