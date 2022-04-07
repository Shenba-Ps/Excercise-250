package com.Excercise;
import java.util.*;
//Write a Java program to convert an array to ArrayList
public class Ex91arraytoarraylist {
    public static void main(String[] args) {
        String[] str={"audi","bmw","tata","benz","maruti"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(str));
        System.out.println(list);
    }
}
