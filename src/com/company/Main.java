package com.company;
/*
* @authors - Timothy Jackson
* @teacher - Dr. Hadfield
* @pex - PEX 1 - Vector Calculator
 */
public class Main {

    public static void main(String[] args) {
	    // introduce user to calculator UI
        System.out.println("Welcome to the Vector Calculator!");

        //initialize input double variables
        double x = 0.0, y = 0.0;

        //main vector calculator function
        vectorCalculator(x,y);
    }

    public static void vectorCalculator( double x, double y){
        System.out.print("Enter vector expression: |<" + x + ",");
        System.out.print(y + ">|");
        System.out.println("\nResult is " + x);
    }

}
