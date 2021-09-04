
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * Created By: AMEER ALHASNAWI SOUTHERN NEW HAMPSHIRE UNIVERSITY
 */
public class RecipeManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Class shows basic attributes: name, amount, unit of measure, and calories
        class Ingredient {

            String nameOfIngredient;       // Ingredient Name
            String unitMeasurement;        //Options: Cup(s), Tbsp(s), Tsp(s), or Gram(s)
            float ingredientAmount;        //Number of unitMeasurement Units
            int numberCaloriesPerUnit;     //Number of Calories per each unit of unitMeasurement
            double totalCalories;          //(Calories Per Unit * Ingredient Amount)
        }

        Scanner scnr = new Scanner(System.in);
        Ingredient newIngredient = new Ingredient(); //Creates New Ingredient "newIngredient" of Class "Ingredient"

        //Initialize Variables
        String nameOfIngredient = "";
        String unitMeasurement = "";       //Enter any type of unit like :Oz, gram, cup, .. etc
        float ingredientAmount = 0;        //Number of unitMeasurement Units
        int numberCaloriesPerUnit = 0;     //Number of Calories per each unit of unitMeasurement
        double totalCalories = 0.0;        //(Calories Per Unit * Ingredient Amount)

//Prompt user for name of ingredient
        System.out.println("Please Enter Ingredient Name: ");
        nameOfIngredient = scnr.nextLine();

//Prompt user for unit of measurement
        System.out.println("Please Enter the Unit of Measurement for this Ingredient. :");
        unitMeasurement = scnr.next();
        System.out.println("You have selected " + unitMeasurement);

//Prompt user for number of units 
        System.out.println("Please enter the number of " + unitMeasurement + " of " + nameOfIngredient + " required (between 1 and 100: )");

        if (scnr.hasNextFloat()) {
            ingredientAmount = scnr.nextFloat();

            if ((ingredientAmount >= 1) && (ingredientAmount <= 100)) {
                System.out.println(ingredientAmount + " is a valid amount. Any recipes using this "
                        + "ingredient will require " + ingredientAmount + " " + unitMeasurement + " of " + nameOfIngredient);
            } else {
                System.out.println(ingredientAmount + " is not a valid amount.");
                System.out.println("Please enter a valid number of units between 1 and 100: ");
                if (scnr.hasNextFloat()) {
                    ingredientAmount = scnr.nextFloat();

                    if ((ingredientAmount >= 1) && (ingredientAmount <= 100)) {
                        System.out.println(ingredientAmount + " is a valid amount!");
                    } else if (ingredientAmount < 1) {
                        System.out.println(ingredientAmount + " is less than 1 unit. Sorry, you are out of attempts.");
                    } else {
                        System.out.println(ingredientAmount + " is greater than 100 units. Sorry, you are out of attempts.");
                    }
                }
            }
        } else {
            System.out.println("Error: That is not a number. Sorry, you are out of attempts.");
        }

//Prompt user for calories per unit
        System.out.println("Please enter the number of calories per " + unitMeasurement + " of " + nameOfIngredient + " (between 1 and 200): ");

        if (scnr.hasNextInt()) {
            numberCaloriesPerUnit = scnr.nextInt();
//Calculate total calories
            totalCalories = ingredientAmount * numberCaloriesPerUnit;

            System.out.println("Congratulations!");
            System.out.println("Any recipe that uses " + nameOfIngredient + " will use " + ingredientAmount + " " + unitMeasurement + " which contains " + totalCalories + " total calories.");

        }
    }
}
