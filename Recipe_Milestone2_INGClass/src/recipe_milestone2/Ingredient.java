/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipe_milestone2;

/**
 *
 * @author eng_a
 */
class Ingredient {

    private String nameOfIngredient;
    private double totalCalories;
    private int ingredientAmount;
    private String unitMeasurement;
    private double numberCaloriesPerUnit;

    /**
     * @return the nameOfIngredient
     */
    public String getNameOfIngredient() {
        return nameOfIngredient;
    }

    /**
     * @param nameOfIngredient the nameOfIngredient to set
     */
    public void setNameOfIngredient(String nameOfIngredient) {
        this.nameOfIngredient = nameOfIngredient;
    }

    /**
     * @return the totalCalories
     */
    public double getTotalCalories() {
        return totalCalories;
    }

    /**
     * @param totalCalories the totalCalories to set
     */
    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }

    /**
     * @return the ingredientAmount
     */
    public int getIngredientAmount() {
        return ingredientAmount;
    }

    /**
     * @param ingredientAmount the ingredientAmount to set
     */
    public void setIngredientAmount(int ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    /**
     * @return the unitMeasurement
     */
    public String getUnitMeasurement() {
        return unitMeasurement;
    }

    /**
     * @param unitMeasurement the unitMeasurement to set
     */
    public void setUnitMeasurement(String unitMeasurement) {
        this.unitMeasurement = unitMeasurement;
    }

    /**
     * @return the numberCaloriesPerUnit
     */
    public double getNumberCaloriesPerUnit() {
        return numberCaloriesPerUnit;
    }

    /**
     * @param numberCaloriesPerUnit the numberCaloriesPerUnit to set
     */
    public void setNumberCaloriesPerUnit(double numberCaloriesPerUnit) {
        this.numberCaloriesPerUnit = numberCaloriesPerUnit;
    }

}
