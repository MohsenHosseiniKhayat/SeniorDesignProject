package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.ViewModels;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Recipe;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Repositories.RecipeRepository;

import java.util.ArrayList;

public class RecipeSearchViewModel
{
    private RecipeRepository repo;

    public RecipeSearchViewModel()
    {
        this.repo = RecipeRepository.getInstance();
    }

    public ArrayList<Recipe> SearchRecipeByIngredient(String queryString)
    {
        return repo.SearchRecipeByIngredient(queryString);
    }

    public ArrayList<Recipe> SearchRecipeByName(String queryString)
    {
        return repo.SearchRecipesByName(queryString);
    }
}
