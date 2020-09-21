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
        System.out.println("Welcome to the Vector Calculator!\n");
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

    }

    private static void parseDirectionExpression(Scanner cmd) throws java.lang.Exception {
        Vector330Class a = Vector330Class.parseVector(cmd);

        double c = a.direction();
        System.out.println("Result is: " + c + " Radians");
        System.out.println();

    }

    private static void parseExpression(Scanner cmd) throws java.lang.Exception {
        if (cmd.hasNext("<")) {
            parseVectorExpression(cmd);
        } else if (cmd.hasNext("\\d")) {
            cmd.next("\\d");
            parseScaleExpression(cmd);
        } else if (cmd.hasNext("\\|")) {
            cmd.next("\\|");
            parseNormExpression(cmd);
        } else if (cmd.hasNext("dir")) {
            cmd.next("dir");
            parseDirectionExpression(cmd);
        } else if (cmd.hasNext("unit")) {
            cmd.next("unit");
            parseNormalizeExpression(cmd);
        }
    }

    private static void parseNormalizeExpression(Scanner cmd) throws java.lang.Exception {
        Vector330Class a = Vector330Class.parseVector(cmd);

        Vector330Class c = a.normalize();
        System.out.println("Result is: " + c);
        System.out.println();
    }

    private static void parseNormExpression(Scanner cmd) throws java.lang.Exception {
        Vector330Class a = Vector330Class.parseVector(cmd);

        double c = a.magnitude();
        System.out.println("Result is: " + c);
        System.out.println();
    }

    private static void parseScaleExpression(Scanner cmd) throws java.lang.Exception {
        // not given example in word doc but left function here
    }

    private static void parseVectorExpression(Scanner cmd) throws java.lang.Exception {
        Vector330Class a = Vector330Class.parseVector(cmd);

        if (cmd.hasNext()) {
            if (cmd.hasNext("[+]")) {
                cmd.next("[+]");
                if (cmd.hasNext("<")) {
                    Vector330Class b = Vector330Class.parseVector(cmd);
                    Vector330Class c = a.add(b);
                    System.out.println("Result is: " + c);
                    System.out.println();
                }
            } else if (cmd.hasNext("[-]")) {
                cmd.next("[-]");
                if (cmd.hasNext("<")) {
                    Vector330Class b = Vector330Class.parseVector(cmd);
                    Vector330Class c = a.subtract(b);
                    System.out.println("Result is: " + c);
                    System.out.println();
                }
            } else if (cmd.hasNext("[.]")) {
                cmd.next("[.]");
                if (cmd.hasNext("<")) {
                    Vector330Class b = Vector330Class.parseVector(cmd);
                    double c = a.dotProduct(b);
                    System.out.println("Result is: " + c);
                    System.out.println();
                }
            }
        }

    }
}