/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionrecipemanager;

import java.util.Scanner;

/**
 *
 * @author AMEER
 */
public class CollectionRecipeManager {

    //Main method to run the code
    public static void main(String[] args) {
        // recipe box to make a recipeCollection.
		RecipeBox recipeCollection = new RecipeBox();
		// To read the input from the user.
		Scanner scan = new Scanner(System.in);
		int option = 0;
		String recipeName;
		
		// Loop will keep on running until the user choose (6) to exit.
		do {
			
			// Displaying the menu to the user.
			System.out.print("*** Recipe Collection ***\n\n"
					+ "1: Add New Recipe\n"
					+ "2: Edit Recipe\n"
					+ "3: Delete Recipe\n"
					+ "4: Print All Recipe Names\n"
					+ "5: Print Recipe Details\n"
					+ "6: Exit\n\n"
					+ "Select Your Choice (1-6): ");
			// taking the user choice.
			option = Integer.parseInt(scan.nextLine());
			System.out.println();
			// do operations according to the choice.
			switch(option) {
				
				// if user select 1.
				case 1:
					// adding a new recipe.
					recipeCollection.addNewRecipe();
					break;
					// if user select 2.
				case 2:
					// taking recipe name from the user.
					System.out.print("Enter Recipe Name to Edit: ");
					recipeName = scan.nextLine();
					// editing the recipe.
					if(recipeCollection.editRecipe(recipeName)) {
						System.out.println("Recipe Edited Successfully!");
					} else {
						System.out.println("Recipe name '"+recipeName+"' not found!");
					}
					break;
					// if user select 3.
				case 3:
					// taking recipe name from the user.
					System.out.print("Enter Recipe Name to Delete: ");
					recipeName = scan.nextLine();
					// deleting the recipe.
					if(recipeCollection.deleteRecipe(recipeName)) {
						System.out.println("Recipe Deleted Successfully!");
					} else {
						System.out.println("Recipe name '"+recipeName+"' not found!");
					}
					break;
					// if user select 4.
				case 4:
					// printing all recipe names.
					recipeCollection.printAllRecipeNames();
					break;
					// if user select 5.
				case 5:
					// taking recipe name from the user.
					System.out.print("Enter Recipe Name to get All Details: ");
					recipeName = scan.nextLine();
					recipeCollection.printAllRecipeDetails(recipeName);
					break;
					// if user select 6.
				case 6:
					System.out.println("Thank you for using Recipe Box Collection.");
					break;
					// if user select different option.
				default:
					System.out.println("Print select correction option from 1-6.");
					
			}
			System.out.println();
			
			// ending loop if user enters the 6.
		} while (option != 6);
		
	}

}
