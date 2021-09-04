package recipe_milestone2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author snhu.edu
 */
public class recipe_milestone2 {

    private String recipeName;
    private int servings;
    private ArrayList<String> recipeIngredients;
    private double totalRecipeCalories;

    /**
     * @return the recipeName
     */
    public String getRecipeName() {
        return recipeName;
    }

    /**
     * @param recipeName the recipeName to set
     */
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    /**
     * @return the servings
     */
    public int getServings() {
        return servings;
    }

    /**
     * @param servings the servings to set
     */
    public void setServings(int servings) {
        this.servings = servings;
    }

    /**
     * @return the recipeIngredients
     */
    public ArrayList<String> getRecipeIngredients() {
        return recipeIngredients;
    }

    /**
     * @param recipeIngredients the recipeIngredients to set
     */
    public void setRecipeIngredients(ArrayList<String> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    /**
     * @return the totalRecipeCalories
     */
    public double getTotalRecipeCalories() {
        return totalRecipeCalories;
    }

    /**
     * @param totalRecipeCalories the totalRecipeCalories to set
     */
    public void setTotalRecipeCalories(double totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }

    public recipe_milestone2() {
        this.recipeName = "";
        this.servings = 0;
        this.recipeIngredients = new ArrayList<>();
        this.totalRecipeCalories = 0;
    }

    public recipe_milestone2(String recipeName, int servings, ArrayList<String> recipeIngredients, double totalRecipeCalories) {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }
// Print Recipe Method
    public void printRecipe() {
        double singleServingCalories = totalRecipeCalories / servings;
        System.out.println("Recipe: " + getRecipeName());
        System.out.println("Yield: " + getServings() + " servings");
        System.out.println("Ingredients:");
// For loop to print all the ingredients list
        for (int i = 0; i < recipeIngredients.size(); i++) {
            String Ingredient = recipeIngredients.get(i);
            System.out.println(Ingredient);
        }

        System.out.println("Total Calories per serving: " + singleServingCalories);
    }
// Create a new recipe method
    public recipe_milestone2 createNewRecipe() {
        double totalRecipeCalories = 0;
        ArrayList<String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();

        System.out.println("How many servings: ");
        int servings = scnr.nextInt();

        do {
            // prompt the user to keep entering ingredient until he enters e
            System.out.println("Please enter the ingredient name or type 'e' if you are done: "); 
            String ingredientName = scnr.next();
            if (ingredientName.toLowerCase().equals("e")) {
                addMoreIngredients = false;
            } else {
                recipeIngredients.add(ingredientName);
                addMoreIngredients = true;
                System.out.println("Please enter the number of units of the ingredient to be used: ");
                int ingredientAmount = scnr.nextInt();

                System.out.println("Please enter the ingredient Calories per unit: ");
                int ingredientCalories = scnr.nextInt();

                totalRecipeCalories = (ingredientCalories * ingredientAmount);

            }
        } while (addMoreIngredients);

       recipe_milestone2 recipe1 = new recipe_milestone2(recipeName, servings, recipeIngredients, totalRecipeCalories);
    recipe1.printRecipe();
    return recipe1;
    
    } 
}

 