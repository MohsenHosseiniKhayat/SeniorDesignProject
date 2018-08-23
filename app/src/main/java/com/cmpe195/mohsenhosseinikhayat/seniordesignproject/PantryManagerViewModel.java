package com.cmpe195.mohsenhosseinikhayat.seniordesignproject;

import java.util.ArrayList;

public class PantryManagerViewModel
{
    private PantryRepository repo;
    private ArrayList<Ingredient> myIngredients;

    public PantryManagerViewModel()
    {
        this.repo = PantryRepository.getInstance();
        myIngredients = repo.getMyIngredients();
    }

    public ArrayList<Ingredient> getMyIngredients() {
        return myIngredients;
    }

    public void deleteIngredient(int index)
    {
        myIngredients.remove(index);
    }
}
