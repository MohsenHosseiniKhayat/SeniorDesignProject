package com.cmpe195.mohsenhosseinikhayat.seniordesignproject;

public class IngredientDetailViewModel {

    private PantryRepository repo;
    private String ingredientName;
    private Ingredient ingredient;

    public IngredientDetailViewModel(String ingredientName)
    {
        repo = PantryRepository.getInstance();
        this.ingredientName  = ingredientName;

        ingredient = repo.getIngredientWithName(ingredientName);
    }

    public Ingredient getIngredient() {
        return ingredient;
    }
}
