package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
//        char[] ch = new char[userInput.length()];
//
//        // Copy character by character into array
//        for (int i = 0; i < userInput.length(); i++) {
//            ch[i] = userInput.charAt(i);
//        }
//
//        // Printing content of array
//        for (char c : ch) {
//            System.out.println(c);
//        }

//        Pattern p = Pattern.compile("\\d+");
//        Matcher m = p.matcher(userInput);
//        while(m.find()) {
//            int i = 1;
//            if ( i == 1) {
//                System.out.println(m.group());
//                x = Integer.parseInt(m.group());
//                System.out.println("x is: " + x);
//            }
//            else {
//                System.out.println(m.group());
//                y = Integer.parseInt(m.group());
//                System.out.println("y is: " + y);
//                i++;
//            }
//        }

        //parse input for integers
//        if(userInput.contains("|")){
//            System.out.println("Found \"|\""); // debug
//        }

    }

}
