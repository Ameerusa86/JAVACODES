
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eng_a
 */
public class SteppingStone4_Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String recipeName = ""; // Stores the recipe name
        ArrayList<String> ingredientList = new ArrayList(); // Create an arrayList to store the list of Ingredient in a recipe
        String newIngredient = ""; // Stores the name of Ingredient
        boolean addMoreIngredients = true; //if the condition is (TRUE), continue to add more Ingredient otherwise (STOP)

        System.out.println("Please enter the recipe name: "); // Ask the user to enter the recipe name
        recipeName = scnr.nextLine();

        do {
            System.out.println("Would you like to enter an ingredient: (y or n)");
            String reply = scnr.next().toLowerCase(); // to convert the entered letters to small (y&n), so the code will work if the user entered (Y or y) & (N or n) 

            if (reply.equals("y")) { // if entered value is(y)
                System.out.println("What is the ingredient?");
                newIngredient = scnr.next();
                ingredientList.add(newIngredient); // add the ingredient to the ArrayList
                addMoreIngredients = true; // condition is TRUE
            } else if (reply.equals("n")) { // if entered value is(n) 
                addMoreIngredients = false; // condidtion is FALSE, break 

            }
        } while (addMoreIngredients);

        for (int i = 0; i < ingredientList.size(); i++) { // Loop over ingredient from 0 index to length of List
           
            String ingredient = ingredientList.get(i);
            System.out.println(ingredient);
        }
    }
}
