package steppingstone5_recipe;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SteppingStone5_Recipe {

    private String recipeName;
    private int servings; // store how many people the recipe will feed
    private ArrayList<Ingredient> recipeIngredients = new ArrayList<>(); // store the text for the names each recipe ingredient added
    private double totalRecipeCalories; // store the total recipe calories

    public String getrecipeName() {
        return getRecipeName();
    }

    public void setrecipeName(String recipeName) {
        this.setRecipeName(recipeName);
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public ArrayList<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<Ingredient> recipeIngredients) {
        this.setRecipeIngredients((ArrayList<Ingredient>) recipeIngredients);
    }

    public double getTotalRecipeCalories() {
        return totalRecipeCalories;
    }

    public void setTotalRecipeCalories(double totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }

    public SteppingStone5_Recipe() {
        this.recipeName = "";
        this.servings = 0;
        this.recipeIngredients = new ArrayList<>();
        this.totalRecipeCalories = 0;

    }

    public SteppingStone5_Recipe(String recipeName, int servings, ArrayList<Ingredient> recipeIngredients, double totalRecipeCalories) {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }

      public void addRecipe() {
        double totalRecipeCalories = 0;
        ArrayList<Ingredient> recipeIngredients = new ArrayList();
        String ingredientName = "";
        String unitMeasurement = "";
        boolean addMoreIngredients = true;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();

        System.out.println("Please enter the number of servings: ");
        int servings = 0;

        do {
            System.out.println("Please enter the ingredient name or type end if you are finished entering ingredients: ");
            ingredientName = scnr.next();
            if (ingredientName.toLowerCase().equals("end")) {
                addMoreIngredients = false;

            } else {
                Ingredient newIng = new Ingredient();
                newIng.addNewIngredient(ingredientName);
                
                System.out.println("Please enter the ingredient amount: ");
                float ingredientAmount = scnr.nextFloat();
                newIng.setIngredientAmount(ingredientAmount);
                
                System.out.println("Please enter a unit of measurement: ");
                unitMeasurement = scnr.next();
                newIng.setUnitMeasurement(unitMeasurement);
                                
                System.out.println("Please enter the ingredient Calories: ");
                int ingredientCalories = scnr.nextInt();
                newIng.setNumberCaloriesPerCup(ingredientCalories);

                // Calculate total recipe calories
                totalRecipeCalories = (ingredientCalories * ingredientAmount);
                newIng.setTotalCalories(totalRecipeCalories);
                System.out.println("Total recipe calories are:" +totalRecipeCalories);
            }

        } while (addMoreIngredients);

        SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(recipeName,
                servings, recipeIngredients, totalRecipeCalories);
        this.setRecipeName(recipeName);
        this.setServings(servings);
        this.setRecipeIngredients(recipeIngredients);
        this.setTotalRecipeCalories(totalRecipeCalories);
        printRecipe();
               
    }
      
    /**
     * @return the recipeName
     */
    public String getRecipeName() {
        return recipeName;
    }

    /**
     * @param recipeIngredients the recipeIngredients to set
     */
    public void setRecipeIngredients(ArrayList<Ingredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public void printRecipe() {

        int singleServingCalories = 0;
        singleServingCalories = (int) (totalRecipeCalories / servings);

        System.out.println("Recipe: " + recipeName);
        System.out.println("Serves: " + servings);
        System.out.println("Ingredients: ");
        for (int i = 0; i < recipeIngredients.size(); i++) {
            System.out.println(" " + recipeIngredients.get(i));
        }
        System.out.println("Each serving has " + singleServingCalories + " Calories");
    }
}

