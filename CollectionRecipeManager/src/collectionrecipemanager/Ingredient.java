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
public class Ingredient {

   // Attributes..
	private String nameOfIngredient; // represents the name of ingredient.
	private float numberCups; // represents the number of cups of ingredient.
	private int numberCaloriesPerCup; // represents the number of calories in each cup.
	private double totalCalories; // represents the total calories.
	
	// Default..
	public Ingredient() {
	
		// Setting the default values..
		this.nameOfIngredient = "";
		this.numberCups = 0;
		this.numberCaloriesPerCup = 0;
		this.totalCalories = 0;
	
	}
	
	// Constructor..
	public Ingredient(String _nameOfIngredient, float _numberCups,
			int _numberCaloriesPerCup, double _totalCalories) {
	
		// Setting the given values..
		this.nameOfIngredient = _nameOfIngredient;
		this.numberCups = _numberCups;
		this.numberCaloriesPerCup = _numberCaloriesPerCup;
		this.totalCalories = _totalCalories;
	
	}
	
	// Getter and Setters..
	public String getNameOfIngredient() {
	
		return nameOfIngredient;
	
	}

	public float getNumberCups() {
	
		return numberCups;
	
	}
	
	public int getNumberCaloriesPerCup() {
	
		return numberCaloriesPerCup;
	
	}
	
	public double getTotalCalories() {
	
		return totalCalories;
	
	}
	
	public void setNameOfIngredient(String _nameOfIngredient) {
	
		this.nameOfIngredient = _nameOfIngredient;
	
	}
	
	public void setNumberCups(float _numberCups) {
	
		this.numberCups = _numberCups;
	
	}
	
	public void setNumberCaloriesPerCup(int _numberCaloriesPerCup) {
	
		this.numberCaloriesPerCup = _numberCaloriesPerCup;
	
	}
	
	public void setTotalCalories(double _totalCalories) {
	
		this.totalCalories = _totalCalories;
	
	}
	
	// Adding ingredient data reading from user.
	public Ingredient addIngredient(String name) {
		
		// opening the scanner to read the input.
		Scanner scanner = new Scanner(System.in);

		// setting the name of ingredient.
        nameOfIngredient = name;

        // Taking the number of cups.
        System.out.print("Please Enter the Number of Cups: ");
        numberCups = Float.parseFloat(scanner.nextLine());
        
        // Taking the number of calories in cup.
        System.out.print("Please Enter the Number of Calories per Cup: ");
        numberCaloriesPerCup = Integer.parseInt(scanner.nextLine());
		
        // Calculating the total calories.
        totalCalories = numberCaloriesPerCup * numberCups;
        
        // returning the current object itself.
        return this;
        
	}
	
	// Returning the string of all values of variables in the class.
	@Override
	public String toString() {
		
		return nameOfIngredient + " - Cups: " + numberCups + " Calories Per Cup: "
				+ numberCaloriesPerCup;
		
	}
	
}
