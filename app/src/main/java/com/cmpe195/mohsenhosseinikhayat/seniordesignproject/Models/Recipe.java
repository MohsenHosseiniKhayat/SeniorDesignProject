package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models;

import java.util.Arrays;
import java.util.HashMap;

public class Recipe
{
    private String name;
    private HashMap<Ingredient, Double> ingredients;

    // This is for the serialization process. Serialize this list, then when deserializing this we can refer to the
    // correct ingredients through the pantryRepo. No duplicate data of rewriting ingredient objects.
    private String[] ingredientsNames;


    private double estimatedPrice;
    private String[] cookingSteps;
    private String description;
    private int servings;
    private String[] tags;
    private int calories;
    private MealType mealType;


    public Recipe(String name, String description, HashMap<Ingredient, Double> ingredients, String[] cookingSteps, int servings, String[] tags, MealType mealType, int calories)
    {
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.cookingSteps = cookingSteps;
        this.ingredients = ingredients;
        this.servings = servings;
        this.tags = tags;
        this.mealType = mealType;
    }

    public String getName() {
        return name;
    }

    public double getEstimatedPrice() {
        return estimatedPrice;
    }

    public HashMap<Ingredient, Double> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public int getServings() {
        return servings;
    }

    public MealType getMealType() {
        return mealType;
    }

    public String getDescription() {
        return description;
    }

    public String[] getCookingSteps() {
        return cookingSteps;
    }

    public String[] getTags() {
        return tags;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setCookingSteps(String[] cookingSteps) {
        this.cookingSteps = cookingSteps;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIngredients(HashMap<Ingredient, Double> ingredients) {
        this.ingredients = ingredients;
    }

    public void setEstimatedPrice(double estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object obj) {
        Recipe that = (Recipe) obj;

        return this.name.equals(that.name)
                && this.description.equals(that.description)
                &&  this.ingredients.equals(that.ingredients)
                && Arrays.equals(this.cookingSteps, that.cookingSteps)
                && this.calories == that.calories
                && this.servings == that.servings
                && this.mealType == that.mealType;
    }
}
