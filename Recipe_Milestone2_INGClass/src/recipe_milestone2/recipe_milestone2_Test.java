package recipe_milestone2;

import java.util.ArrayList;

public class recipe_milestone2_Test {

    public static void main(String[] args) {

        recipe_milestone2 newRecipe = new recipe_milestone2();
        newRecipe.getRecipeName();
        newRecipe.createNewRecipe();

        Ingredient ingredient1 = new Ingredient();
        ingredient1.getNameOfIngredient();
        ingredient1.getIngredientAmount();
        ingredient1.getNumberCaloriesPerUnit();
        ingredient1.getUnitMeasurement();

        ArrayList<Ingredient> recipeIngredients = new ArrayList();
        recipeIngredients.add(ingredient1);

        for (int i = 0; i < recipeIngredients.size(); i++) {
            System.out.println(recipeIngredients.get(i));
        }
        
        //newRecipe.setRecipeIngredients(recipeIngredients);

        newRecipe.printRecipe();

    }
}
