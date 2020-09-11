package com.company;

import java.util.Scanner;

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
        // ask user to enter vector expression
        System.out.print("Enter vector expression: ");

        //create scanner class
        Scanner in = new Scanner(System.in);

        //gets user input
        String userInput = in.nextLine();

        //get integers from userInput
        char[] chars = userInput.toCharArray();
        StringBuilder userIntegers = new StringBuilder();
        for(char c : chars){
            if(Character.isDigit(c) || Character.isLetter('.')){
                userIntegers.append(c);
            }
        }
        System.out.println(userIntegers);

        //parse input for integers
//        if(userInput.contains("|")){
//            System.out.println("Found \"|\""); // debug
//        }

    }

}
