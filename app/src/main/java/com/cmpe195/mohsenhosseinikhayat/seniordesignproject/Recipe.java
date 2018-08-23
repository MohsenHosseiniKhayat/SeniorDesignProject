package com.cmpe195.mohsenhosseinikhayat.seniordesignproject;

import java.util.Arrays;

public class Recipe
{
    private String name;
    private Ingredient[] ingredients;
    private double estimatedPrice;
    private String[] cookingSteps;
    private String description;
    private int servings;
    private String[] tags;
    private int calories;
    private MealType mealType;


    public Recipe(String name, String description, Ingredient[] ingredients, String[] cookingSteps, int servings, String[] tags, MealType mealType, int calories)
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

    public Ingredient[] getIngredients() {
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

    public void setIngredients(Ingredient[] ingredients) {
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
                && Arrays.equals(this.ingredients, that.ingredients)
                && Arrays.equals(this.cookingSteps, that.cookingSteps)
                && this.calories == that.calories
                && this.servings == that.servings
                && this.mealType == that.mealType;
    }
}
