/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SteppingStones;

import java.util.Scanner;

public class SteppingStone3_Branches {

    public static void main(String[] args) {
        /**
         * Add a CONSTANT variable MAX_CUPS assigned to the value 100
         */
        int numberCups = -1;
        final int MAX_CUPS = 100;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the number of cups (between 1 and 100): ");

        //The following "if branch" uses the scanner method hasNextInt() to
        //check to see if the input is an int.
        if (scnr.hasNextInt()) {
            numberCups = scnr.nextInt();

            // condition to check if number of cups is between 1 - 100 (inclusive)
            // * if numberCups is greater than or equal to MAX_CUPS: print
            // * numberCups + " is a valid number of cups!"
            if (numberCups >= 1 && numberCups <= MAX_CUPS) {
                System.out.println(numberCups + " is a valid number of cups!");
                System.out.println("Good job! The number you entered is: " + numberCups);
            } // * else: print numberCups + " is a not valid number of cups!" print
            // * "Please enter another number of cups between 1 and 100: "
            else {
                System.out.println(numberCups + " is not a valid number of cups!");
                System.out.println("Please enter another number of cups between 1 and 100: ");
                numberCups = scnr.nextInt();
            }

            // if numberCups < 1: print numberCups + "is less than 1. Sorry you are out of" attempts."
            if (numberCups < 1) {
                System.out.println(numberCups + " is less than 1. Sorry you are out of attempts.");
            } // if numberCups < 1: print numberCups + "is less than 1. Sorry you are out of" attempts."
            else if (numberCups > 100) {
                System.out.println(numberCups + " is greater than 100. Sorry you are out of attempts.");
            }
            } else {
                System.out.println("Error: That is not a number. Try again.");
            }
        }
    }
        /**
         *
         * For your Final Project, adapt your Ingredient java file to include
         * data type validation steps for each of the variables in the class:
         *
         * ingredientName (String) ingredientAmount (float) unitMeasurment
         * (String) number of Calories (double)
         *
         */
