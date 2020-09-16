package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* @authors - Timothy Jackson
* @teacher - Dr. Hadfield
* @pex - PEX 1 - Vector Calculator
 */
public class VectorCalculator {

        public static void main(String[] args) {
        // introduce user to calculator UI
        System.out.println("Welcome to the Vector Calculator!");
        boolean moreToDo = true;
        Scanner in = new Scanner(System.in);

        Pattern startTokens = Pattern.compile("exit|<|\\d|\\||dir|unit");

        while (moreToDo) {
            Scanner cmd = null;
            try {

                System.out.print("Enter vector expression: ");
                String command = in.nextLine();
                cmd = new Scanner(command);
                if (cmd.hasNext("exit")) {
                    cmd.next("exit");
                    moreToDo = false;
                } else if (cmd.hasNext(startTokens)) {
                    parseExpression(cmd);
                } else {
                    throw new Exception("Error invalid start token");
                }
            } catch (Exception e) {
                if (cmd != null) {
                    cmd.close();
                }
                System.out.println("Error encountered with your expression: ");
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Thank you for using the Vector Calculator!");


        System.out.println("Start test with x = 2, y = 3");
        Vector330Class b = new Vector330Class(2, 3);
        System.out.println("x vector as a double: " + b.getX());
        System.out.println("y vector as a double: " + b.getY());
        System.out.println("x vector as a int: " + b.getXint());
        System.out.println("y vector as a int: " + b.getYint());
        System.out.println("x vector as a long: " + b.getXlong());
        System.out.println("y vector as a long: " + b.getYlong());
        b.setX(2);
        b.setY(3);
        b.setX(2.0);
        b.setY(3.0);
        long xX = 2;
        b.setX(xX);
        long yY = 3;
        b.setY(yY);
        System.out.println(b.equals(b));

        }
    private static void parseDirectionExpression(Scanner cmd) throws java.lang.Exception{

    }

    private static void parseExpression(Scanner cmd) throws java.lang.Exception {
        if (cmd.hasNext("<")) {
            parseVectorExpression(cmd);
        } else if (cmd.hasNext("\\d")) {
            parseScaleExpression(cmd);
        }
    }

    private static void parseNormalizeExpression(Scanner cmd) throws java.lang.Exception {
    }

    private static void parseNormExpression(Scanner cmd) throws java.lang.Exception{

    }

    private static void parseScaleExpression(Scanner cmd) throws java.lang.Exception{

    }

    private static void parseVectorExpression(Scanner cmd) throws java.lang.Exception {

        throw new Exception("Invalid Vector ");

    }

}