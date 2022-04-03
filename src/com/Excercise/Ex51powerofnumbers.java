package com.Excercise;
//Java Program To Calculate Power Of Number
public class Ex51powerofnumbers {

        public static void main(String[] args) {

            int base = 3, exponent = 4;

            long result = 1;

            for (; exponent != 0; --exponent) {
                result *= base;
            }

            System.out.println("Answer = " + result);
        }
    }

