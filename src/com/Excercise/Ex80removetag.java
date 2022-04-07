package com.Excercise;

public class Ex80removetag {
    //Write a java program to remove html tags from a string


        public static void main(String a[]){
            String text = "<p>I don't want this p tag<\\p>";
            System.out.println(text);
            text = text.replaceAll("\\<.*?\\>", "");
            System.out.println(text);
        }
    }

