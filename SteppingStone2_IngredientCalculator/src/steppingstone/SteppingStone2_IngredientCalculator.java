/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steppingstone;

import java.util.Scanner;

/**
 *
 * @author Ameer
 */
public class SteppingStone2_IngredientCalculator {

    public static void main(String[] args) {
 
        String nameOfIngredient = "";
        float ingredientAmount = 0;
        int numberOfCaloriesPerCup = 0;
        double totalCalories = 0.0;
        String unitMeasurement = "";
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the name of the ingredient: ");
        nameOfIngredient = scnr.next();

        System.out.println("Please enter the number of cups of "
                + nameOfIngredient + " we'll need: ");
        ingredientAmount = scnr.nextFloat();

        System.out.println("Please enter the name of calories per cup: ");
        numberOfCaloriesPerCup = scnr.nextInt();

        System.out.println("Please enter the unit of measurment: ");
        unitMeasurement = scnr.next();
        /**
         * Write an expression that multiplies the number of cups by the
         * Calories per cup. Assign this value to totalCalories
         */
        totalCalories = ingredientAmount * numberOfCaloriesPerCup;

        System.out.println(nameOfIngredient + " uses " + ingredientAmount + " " + unitMeasurement
                + " and has " + totalCalories + " calories.");

    }

}

