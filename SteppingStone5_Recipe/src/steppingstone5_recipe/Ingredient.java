package steppingstone5_recipe;

import java.util.Scanner;

public class Ingredient {

    private String ingredientName = "";
    private String unitMeasurement = "";
    double ingredientAmount = 0.0;
    int numberCaloriesPerCup = 0;
    double totalCalories = 0.0;

    public Ingredient addNewIngredient(String ingredientName) {
        this.ingredientName = ingredientName;
        return this;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getUnitMeasurement() {
        return unitMeasurement;
    }

    public void setUnitMeasurement(String unitMeasurement) {
        this.unitMeasurement = unitMeasurement;
    }

    public double getIngredientAmount() {
        return ingredientAmount;
    }

    public void setIngredientAmount(double ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    public int getNumberCaloriesPerCup() {
        return numberCaloriesPerCup;
    }

    public void setNumberCaloriesPerCup(int numberCaloriesPerCup) {
        this.numberCaloriesPerCup = numberCaloriesPerCup;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }
}