package com.Excercise;
import java.util.*;
//Write a Java program to find the common elements between two arrays

public class Ex89commonelement {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int[] b={2,4,6,8,10,11,12,13};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for (int i=0;i< a.length;i++){
            for (int j=0;j< b.length;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }

}
