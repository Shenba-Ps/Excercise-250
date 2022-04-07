package com.Excercise;
import java.util.*;
//Write a Java program to print all unique element in an array

public class Ex99unique {
    public static void main(String[] args) {
       Integer [] numbers={0,1,2,3,4,5,6,7,8,9,2,3,4,5};
        Set<Integer> uniquekeys=new TreeSet<Integer>();
       uniquekeys.addAll(Arrays.asList(numbers));
        System.out.println(uniquekeys);
    }
}

//    public static void main(String[] args) {
//            Integer[] numbers = {1, 1, 2, 1, 3, 4, 5};
//            Set<Integer> uniqKeys = new TreeSet<Integer>();
//            uniqKeys.addAll(Arrays.asList(numbers));
//            System.out.println("uniqKeys: " + uniqKeys);
//        }
//    }
//}