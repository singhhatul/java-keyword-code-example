package com.stackroute.keywords.numberAndStrings;

public class ConversionStringInteger {
    public static void main(String[] args) {
        int a = 1234;
        int b = -1234;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        String num1="1234";
        String num2="-1234";

        System.out.println("String str1 = " + str1);
        System.out.println("String str2 = " + str2);
        System.out.println("first number = "+Integer.parseInt(num1));
        System.out.println("second number = "+Integer.parseInt(num2));
    }
}
