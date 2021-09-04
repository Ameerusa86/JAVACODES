/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steppingstone5_recipe;

import java.util.ArrayList;

/**
 *
 * @author Ameer
 */
public class SteppingStone5_RecipeTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Create two recipe objects first
        SteppingStone5_Recipe myFirstRecipe = new SteppingStone5_Recipe();
        ArrayList<Ingredient> recipeIngredients = new ArrayList();
        ArrayList<Ingredient> recipeIngredientsTwo = null;
        String ingredientName = "Anchovies";
        Ingredient tempIngredient = new Ingredient().addNewIngredient(ingredientName);
        recipeIngredients.add(tempIngredient);

        SteppingStone5_Recipe mySecondRecipe = new SteppingStone5_Recipe("Pizza", 2, recipeIngredients, 300);

        // Initialize first recipe
        String ingredientNameTwo = "Noodles";
        Ingredient tempIngredientTwo = new Ingredient().addNewIngredient(ingredientName);
        recipeIngredients.add(tempIngredient);

        myFirstRecipe.setRecipeName("Ramen");
        myFirstRecipe.setServings(2);
        myFirstRecipe.setRecipeIngredients(recipeIngredientsTwo);
        myFirstRecipe.setTotalRecipeCalories(150);

        // Print details of both recipes
        myFirstRecipe.printRecipe();
        mySecondRecipe.printRecipe();
    }

}
