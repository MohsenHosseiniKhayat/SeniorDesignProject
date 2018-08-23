package com.cmpe195.mohsenhosseinikhayat.seniordesignproject;

import java.util.ArrayList;
import java.util.HashMap;

class PantryRepository {
    private static PantryRepository ourInstance = new PantryRepository();

    private HashMap<String, Ingredient> ingredientsHashMap;
    private ArrayList<Ingredient> myIngredients;

    public PantryRepository()
    {
        //Need to load these stuff, from json
        if (ourInstance != null)
        {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }

        myIngredients = new ArrayList<>();
        ingredientsHashMap = new HashMap<String, Ingredient>();
        tempCreateIngredientsForTesting();
    }

    /**
     * Add the ingredient and its quantity to the pantry
     * @param command command confirmed
     */
    public void processCommand(IngredientCommand command)
    {
        Ingredient currentIngredient = command.getIngredient();
        currentIngredient.setQuantity(command.getQuantity());

        if (myIngredients.indexOf(currentIngredient) == -1)
        {
            myIngredients.add(currentIngredient);
        }
    }

    /**
     * Returns the ingredients we have in the app
     * @return an array of ingredients in the app
     */
    public HashMap<String, Ingredient> getIngredients()
    {
        return ingredientsHashMap;
    }

    public void tempCreateIngredientsForTesting()
    {
        String [] names = {"apple", "banana", "onion", "cucumber", "pomegranate", "water", "flour"};
        MeasurementUnit [] measurementUnits = {MeasurementUnit.POUND,
                MeasurementUnit.KILOGRAM,
                MeasurementUnit.GRAM,
                MeasurementUnit.POUND,
                MeasurementUnit.MILLIGRAM,
                MeasurementUnit.CUP,
                MeasurementUnit.TEASPOON};

        ingredientsHashMap = new HashMap<String, Ingredient>();

        for (int i = 0; i < names.length; i++)
        {
            ingredientsHashMap.put(names[i], new Ingredient(names[i], measurementUnits[i], 0.0));
        }
    }
    
    public ArrayList<Ingredient> getMyIngredients() {
        return myIngredients;
    }

    static PantryRepository getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new PantryRepository();
        }

        return ourInstance;
    }

    public Ingredient getIngredientWithName(String ingredientName) {

        return ingredientsHashMap.get(ingredientName);
    }
}
