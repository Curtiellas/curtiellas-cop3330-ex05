package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        //reading numbers as strings
        System.out.print("What is the first number? ");
        String numString1 = sc.next();

        System.out.print("What is the second number? ");
        String numString2 = sc.next();

        //converting the strings to ints
        int num1 = Integer.parseInt(numString1);
        int num2 = Integer.parseInt(numString2);

        int add = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        //entire output in one line of code, \n jumps to the next line
        System.out.println( num1 + " + " + num2 + " = " + add + "\n" +
                            num1 + " - " + num2 + " = " + sub + "\n" +
                            num1 + " * " + num2 + " = " + mult + "\n" +
                            num1 + " / " + num2 + " = " + div + "\n");
        ///////////////////////////////////
    }
}
