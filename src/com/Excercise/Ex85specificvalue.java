package com.Excercise;
//Write a Java program to test if an array contains a specific value

public class Ex85specificvalue {
    public static boolean contains(int[] arr,int item){
        for(int num:arr){
            if (item==num){
                return true;
            }
        } return false;
    }

    public static void main(String[] args) {
        int[ ] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println(contains(array,22));
        System.out.println(contains(array,2));
    }
}
