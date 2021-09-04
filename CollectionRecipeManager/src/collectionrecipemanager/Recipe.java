/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionrecipemanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AMEER
 */
public class Recipe {
    

    // Attributes..
    private String recipeName;
    private int servings; // store how many people the recipe will feed
    private ArrayList<Ingredient> recipeIngredients; // store the names each ingredient
    private double totalRecipeCalories; // store the total recipe calories

    // Default Constructor
    // Setting up variables with default values.
    public Recipe() {
    	
        this.recipeName = "";
        this.servings = 0;
        this.recipeIngredients = new ArrayList<>();
        this.totalRecipeCalories = 0;

    }

    // Constructor with variables.
    // Setting the variables with the supplied data.
    public Recipe(String _recipeName, int _servings,
            ArrayList<Ingredient> _recipeIngredients,
            double _totalRecipeCalories) {
    	
        this.recipeName = _recipeName;
        this.servings = _servings;
        this.recipeIngredients = _recipeIngredients;
        this.totalRecipeCalories = _totalRecipeCalories;
    
    }

    // return the value of recipe name
    public String getRecipeName() {
        return recipeName;
    }

    // Setting new value for the variable recipe name
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    // return the value of servings
    public int getServings() {
        return servings;
    }

    // Setting new value for the variable servings
    public void setServings(int servings) {
        this.servings = servings;
    }

    // return the value of recipe ingredients 
    public ArrayList<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    // Setting new value for the variable recipe ingredients
    public void setRecipeIngredients(ArrayList<Ingredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    // return the value of total calories in recipe
    public double getTotalRecipeCalories() {
        return totalRecipeCalories;
    }

    // Setting new value for the variable  calories
    public void setTotalRecipeCalories(double totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }

    // It will print the recipe on the screen.
    public void printRecipe() {

        // Calculating the calories for single serving
        int singleServingCalories = ((int) (totalRecipeCalories / servings));

        // Printing the variables data
        System.out.println("Recipe Name    : " + recipeName);
        System.out.println("Total Servings : " + servings);
        System.out.println("Total Calories : " + String.format("%.2f", totalRecipeCalories));
        System.out.println("Ingredients    : ");
        // For loop to print the ingredients of the recipe.
        for (int i = 0; i < recipeIngredients.size(); i++) {
            System.out.println("   " + (i + 1) + ": " + recipeIngredients.get(i));
        }
        System.out.println("Each serving has " + singleServingCalories + " Calories");

    }

    // Creating the recipe with user input.
    // It will take input from user and set the variables..
    public void createNewRecipe() {

        boolean addMoreIngredients;
        Scanner scanner = new Scanner(System.in);

        // Taking the recipe name.
        System.out.print("Please Enter the Recipe Name: ");
        recipeName = scanner.nextLine();

        // Taking the servings.
        System.out.print("Please Enter the Number of Servings: ");
        servings = Integer.parseInt(scanner.nextLine());

        // clearing the ingredients.
        this.recipeIngredients.clear();
        // running the loop until user finish entering ingredients.
        do {

            // Taking the ingredients name.
            System.out.print("Please Enter the Ingredient Name or (end to finish): ");
            String ingredientName = scanner.nextLine();
            // If ingredient name is "end" then it will finish taking input.
            // else it will take input further.
            if (ingredientName.toLowerCase().equals("end")) {
                addMoreIngredients = false;
            } else {

                addMoreIngredients = true; // add more Ingredients

                // Creating a new ingredient
                Ingredient ingredient = new Ingredient();
                ingredient.addIngredient(ingredientName);
                
                // Appending the calories into the recipe
                totalRecipeCalories += ingredient.getTotalCalories();
                // Adding the ingredient into the recipe
                this.recipeIngredients.add(ingredient);
            
            }

        } while (addMoreIngredients);
        // Loop ends.
        // All input is taken, and recipe is created.
        System.out.println("Recipe Created Successfully.");

    }

}

    
