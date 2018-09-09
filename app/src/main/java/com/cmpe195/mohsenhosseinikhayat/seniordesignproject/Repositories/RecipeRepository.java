package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Repositories;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.MealType;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Recipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

public class RecipeRepository {
    private static RecipeRepository ourInstance = new RecipeRepository();

    private RecipeRepository() {
        if (ourInstance != null)
        {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    /**
     * Search for recipe by name
     * @param queryString User input
     * @return Recipes that match the name
     */
    public ArrayList<Recipe> SearchRecipesByName(String queryString)
    {
        Recipe[] fakeRecipes = FakeRecipesForMohsen();
        ArrayList<Recipe> results = new ArrayList<>();

        for (int i = 0; i< fakeRecipes.length; i++)
        {
            Recipe currentRecipe = fakeRecipes[i];

            if (currentRecipe.getName().contains(queryString))
            {
                results.add(currentRecipe);
            }
        }

        return results;
    }


    /**
     * Search for recipe by ingredient
     * @param queryString User input
     * @return Recipes that contain that ingredient
     */
    public ArrayList<Recipe> SearchRecipeByIngredient(String queryString)
    {
        Recipe[] fakeRecipes = FakeRecipesForMohsen();
        ArrayList<Recipe> results = new ArrayList<>();

        for (int i = 0; i < fakeRecipes.length; i++)
        {
            Recipe currentRecipe = fakeRecipes[i];

            if (Arrays.asList(currentRecipe.getIngredients()).contains(queryString))
            {
                results.add(currentRecipe);
            }
        }

        return results;
    }

    /**
     * Search for recipe by calories
     * @param calories Calories target by user
     * @return Recipes that have less or equal calories to user target
     */
    public ArrayList<Recipe> SearchRecipeByCalories(int calories)
    {
        Recipe[] fakeRecipes = FakeRecipesForMohsen();
        ArrayList<Recipe> results = new ArrayList<>();

        for (int i = 0; i < fakeRecipes.length; i++)
        {
            Recipe currentRecipe = fakeRecipes[i];

            if (currentRecipe.getCalories() < calories)
            {
                results.add(currentRecipe);
            }
        }

        return results;
    }

    /**
     * Search for recipes by tags
     * @param queryString User tag input
     * @return Recipes that contain said tag
     */
    public ArrayList<Recipe> SearchRecipeByTag(String queryString)
    {
        Recipe[] fakeRecipes = FakeRecipesForMohsen();
        ArrayList<Recipe> results = new ArrayList<>();

        for (int i = 0; i < fakeRecipes.length; i++)
        {
            Recipe currentRecipe = fakeRecipes[i];

            if (Arrays.asList(currentRecipe.getTags()).contains(queryString))
            {
                results.add(currentRecipe);
            }
        }

        return results;
    }

    /**
     * Fake recipes for testing
     * @return A bunch of recipes
     */
    private Recipe[] FakeRecipesForMohsen()
    {
        Recipe recipe1 = new Recipe("chicken shawarma", "shawarma with chicken", new String[] {"chicken", "banana"},
                new String[] {"step1", "step2"}, 2, new String [] {"tag1"}, MealType.LUNCH, 300);

        Recipe recipe2 = new Recipe("beef shawarma", "shawarma with beef", new String[] {"beef", "banana"},
                new String[] {"step1", "step3"}, 2, new String [] {"tag1"}, MealType.LUNCH, 300);

        Recipe recipe3 = new Recipe("combo shawarma", "shawarma with beef and chicken", new String[] {"beef", "chicken","banana"},
                new String[] {"step1", "step2", "step3"}, 2, new String [] {"tag2", "tag3"}, MealType.LUNCH, 450);

        Recipe recipe4 = new Recipe("apple pie", "pie with apple", new String[] {"apple","flour"},
                new String[] {"step4", "step2"}, 3, new String [] {"tag5", "tag4"}, MealType.APPETIZER, 107);

        Recipe recipe5 = new Recipe("onion rings", "onions with rings", new String[] {"onions","flour", "water"},
                new String[] {"step4", "step7", "step1"}, 5, new String [] {"tag5"}, MealType.SNACK, 259);

        Recipe recipe6 = new Recipe("water", "plain water", new String[] {"water"},
                new String[] {"step4", "step9", "step3"}, 10, new String [] {"tag4"}, MealType.DRINK, 170);

        Recipe recipe7 = new Recipe("pepperoni pizza", "pepperoni on pizza", new String[] {"pepperoni", "flour", "onion"},
                new String[] {"step2", "step5"}, 6, new String [] {"tag7"}, MealType.DINNER, 560);

        Recipe recipe8 = new Recipe("cucumber salad", "salad with cucumber", new String[] {"cucumber", "onion"},
                new String[] {"step1", "step4", "step6"}, 3, new String [] {"tag8", "tag1"}, MealType.APPETIZER, 68);

        Recipe recipe9 = new Recipe("fish", "fish, i dont like fish", new String[] {"fish", "water", "onion"},
                new String[] {"step5", "step3"}, 2, new String [] {"tag4", "tag8"}, MealType.LUNCH, 325);

        Recipe recipe10 = new Recipe("fish and chips", "fish and chips", new String[] {"fish", "onion", "potato"},
                new String[] {"step5", "step3", "step7"}, 4, new String [] {"tag3", "tag1"}, MealType.LUNCH, 385);

        return new Recipe[] {recipe1, recipe2, recipe3, recipe4, recipe5, recipe6, recipe7, recipe8, recipe9, recipe10};
    }

    /**
     * Fetch the repo instance, if non existent, creates one
     * @return The instance of the repository
     */
    public static RecipeRepository getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new RecipeRepository();
        }

        return ourInstance;
    }
}
