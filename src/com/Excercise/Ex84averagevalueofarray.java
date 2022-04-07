package com.Excercise;
//Write a Java program to calculate the average value of array elements

public class Ex84averagevalueofarray {
    public static void main(String[] args) {
        int[] a=new int[]{1,11,12,13,14,15,16};
        int sum=0;
        for (int i=0;i< a.length;i++){
            sum=sum+a[i];
            double ave = sum / a.length;
            System.out.println(ave);
        }
    }
}
