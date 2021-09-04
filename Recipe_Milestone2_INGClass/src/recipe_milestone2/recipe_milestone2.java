package recipe_milestone2;

import java.util.ArrayList;
import java.util.Scanner;

public class recipe_milestone2 {
// Initialize class variables

    public String recipeName;
    private int servings;
    private ArrayList<Ingredient> recipeIngredients = new ArrayList();
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
    public ArrayList<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    /**
     * @param recipeIngredients the recipeIngredients to set
     */
    public void setRecipeIngredients(ArrayList<Ingredient> recipeIngredients) {
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
// Constructors

    public recipe_milestone2() {
        this.recipeName = "";
        this.servings = 0;
        this.recipeIngredients = new ArrayList<>();
        this.totalRecipeCalories = 0.0;
    }
// Overloaded Constructor that brings in assigned variables to create an instance of the class.

    /**
     *
     * @param recipeName
     * @param servings
     * @param recipeIngredients
     * @param totalRecipeCalories
     */
    public recipe_milestone2(String recipeName, int servings, ArrayList<Ingredient> recipeIngredients, double totalRecipeCalories) {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }

    /**
     * This method will print the recipe to the console with the format of
     * Recipe: Serves: Ingredients: name amount unit/measure Calories Total
     * Calories
     *
     * Each serving has x Calories for a total of x Calories.
     */
    public void printRecipe() {
// takes the double totalRecipeCalories casts it to an int, then divides by servings
        double singleServingCalories = getTotalRecipeCalories() / getServings();
// Print recipe information
        System.out.println("Recipe: " + getRecipeName());
        System.out.println("Serves: " + getServings());
        System.out.println("Ingredients: " );
// For loop: print each ingredient in the arrayList
        for (int i = 0; i < getRecipeIngredients().size(); i++) {
// Uses the accessor to to the ingredient list at the index of i
            Ingredient ingredientList = getRecipeIngredients().get(i);
// Build a printable list of the ingredients for easier printing
            String list = ingredientList.getNameOfIngredient() + " " + ingredientList.getIngredientAmount() + " " + " " + ingredientList.getNumberCaloriesPerUnit() + " Calories " + ingredientList.getTotalCalories() + " Total Calories";
// Print out the above list of ingredients that has been semiformatted
            System.out.println(recipeIngredients.get(i));
        }
            
// Final printed statement of the recipe, uses accessors from the class to get the values
        System.out.println("Each serving has " + singleServingCalories + " Calories for a total of " + (int) getTotalRecipeCalories() + " Calories.");
    }

    public recipe_milestone2 createNewRecipe() {
        ArrayList<Ingredient> recipeIngredients = new ArrayList();
        int servings = 0;
// Initiate a new scanner object
        Scanner scnr = new Scanner(System.in);
// Initiate a new Ingredient object from the constructor values
        Ingredient newIngredient = new Ingredient();
// Prompt for recipe name
        System.out.println("Please enter the recipe name: ");
        setRecipeName(scnr.nextLine());
        System.out.println("Please enter the number of servings: ");
        servings = scnr.nextInt();
        System.out.println("Servings: " + servings);

        boolean addMoreIngredients = true; // Boolean for clearing the while loop
        do {
            System.out.println("Would you like to enter an ingredient? (y or n)");
            String reply = scnr.next().toLowerCase();// Store scanner input to reply, change input to lower case
// Switch case for entering ingredients
            switch (reply) {
// Yes case, adds the new ingredient that is returned from the createIngredient method
                case "y":
                    System.out.println("Please enter your ingredient name: ");
                    String nameOfIngredient = scnr.next();
                    
// Mutator to set the recipe ingredients
                    setRecipeIngredients(recipeIngredients);
                    break;
// No case, uses the boolean to break out of the while loop
                case "n":
                    addMoreIngredients = false;
                    System.out.println("Please enter the number of units of the ingredient to be used: ");
                    int ingredientAmount = scnr.nextInt();

                    System.out.println("Please enter the ingredient Calories per unit: ");
                    int ingredientCalories = scnr.nextInt();

                    totalRecipeCalories = (ingredientCalories * ingredientAmount);

                    break;
                default:
                    System.out.println("Valid answers are 'y' or 'n'"); // prompt if input doesn't equal y or n
                    break;
            }
        } while (addMoreIngredients); // Will break out when set to false

        recipe_milestone2 newRecipe = new recipe_milestone2(recipeName, servings, recipeIngredients, totalRecipeCalories);
        System.out.println("Recipe for " + getRecipeName() + " saved.");
// Return the object to the calling method
        newRecipe.printRecipe();
        return newRecipe;
    }
}
