/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionrecipemanager;

import java.util.ArrayList;

/**
 *
 * @author AMEER
 */
public class RecipeBox {
    // Attributes..
	private ArrayList<Recipe> listOfRecipes; // Store the list of recipes.
	
	// Default Constructor.
	public RecipeBox() {
		
		this.listOfRecipes = new ArrayList<>();
		
	}
	
	// Constructor.
	public RecipeBox(ArrayList<Recipe> recipes) {
		
		this.listOfRecipes = recipes;
		
	}

	// Getter and Setters..
	public ArrayList<Recipe> getListOfRecipes() {
		
		return listOfRecipes;
		
	}

	public void setListOfRecipes(ArrayList<Recipe> listOfRecipes) {
		
		this.listOfRecipes = listOfRecipes;
		
	}
	
	// Printing the recipe details
	public void printAllRecipeDetails(String selectedRecipe) {
		
		// Iterating through all of the recipes in the list.
		for(Recipe recipe: listOfRecipes) {
			// checking if name of recipe is matches
			if(recipe.getRecipeName().equalsIgnoreCase(selectedRecipe)) {
				// Printing the recipe.
				recipe.printRecipe();
				// breaking the loop.
				break;
			}
		}
		System.out.println();
		
	}
	
	// Print recipe names..
	public void printAllRecipeNames() {

		// Iterating through all of the recipes in the list.
		System.out.println("Recipe Names");
		for(Recipe recipe: listOfRecipes) {
			// Printing the name of each recipe.
			System.out.println("* "+recipe.getRecipeName());
		}
		System.out.println();
		
	}
	
	// Adding a new recipe
	public void addNewRecipe() {
		
		// Creating a recipe.
		Recipe recipe = new Recipe();
		recipe.createNewRecipe();
		// Adding the recipe in the list.
		this.listOfRecipes.add(recipe);
		
	}
	
	// Deleting the recipe of given name,
	public boolean deleteRecipe(String selectedRecipe) {

		// Iterating through all of the recipes in the list.
		for(int i = 0; i < this.listOfRecipes.size(); i++) {
			// checking if name of recipe is matches
			if(listOfRecipes.get(i).getRecipeName().equalsIgnoreCase(selectedRecipe)) {
				// removing the recipe from the list.
				listOfRecipes.remove(i);
				// returning true means it is done successfully/
				return true;
			}
		}
		// return false means, it is failed.
		return false;
		
	}
	
	// Editing the recipe of given name.
	public boolean editRecipe(String selectedRecipe) {

		// Iterating through all of the recipes in the list.
		for(int i = 0; i < this.listOfRecipes.size(); i++) {
			// checking if name of recipe is matches
			if(listOfRecipes.get(i).getRecipeName().equalsIgnoreCase(selectedRecipe)) {
				// Taking and setting the new values..
				listOfRecipes.get(i).createNewRecipe();
				// returning true means it is done successfully/
				return true;
			}
		}
		// return false means, it is failed.
		return false;
		
	}
	
}


