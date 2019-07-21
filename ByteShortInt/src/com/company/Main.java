package com.company;

public class Main {

    public static void main(String[] args) {
	//1. Create a byte variable and set it to any valid byte number
       byte myByteValue = 10;
               //2. Create a short variable and set it to any valid short number
        short myShortValue = 20;
        //3. Create a int variable and set it to any valid int number
        int myIntValue = 30;
        //4. Create a variable of type long, and make it equal to
        //  5000 + 10 times the sum of the byte, plus the short plus the int
        long myLongTotal = 50000+10*(myByteValue+myIntValue+myShortValue);
        System.out.println("myLongTotal = " +myLongTotal);
        //to print short we have to do something called CASTING
        short myShortTotal =(short) (1000 + 10*(myByteValue+myShortValue+myIntValue));
        System.out.println("myShortTotal = " +myShortTotal);
        float myFloatValue = (float) 5.4;

    }
}
