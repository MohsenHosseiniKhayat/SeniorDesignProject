package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.ViewModels;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Ingredient;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.MeasurementUnit;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Repositories.PantryRepository;

public class IngredientDetailViewModel {

    private PantryRepository repo;
    private Ingredient ingredient;

    /**
     * Constructor for the view model
     * @param ingredientName The name of the ingredient we are going to display
     */
    public IngredientDetailViewModel(String ingredientName)
    {
        repo = PantryRepository.getInstance();

        ingredient = repo.getIngredientWithName(ingredientName);
    }

    public String getName()
    {
        return ingredient.getName();
    }

    public Double getQuantity()
    {
        return ingredient.getQuantity();
    }

    public int getAlertQuantity()
    {
        return (int) ingredient.getAlertQuantity();
    }

    public MeasurementUnit getMeasurementUnit()
    {
        return ingredient.getMeasuringUnit();
    }

    public int getMaxAlertQuantity()
    {
        switch (ingredient.getMeasuringUnit())
        {
            case MILLIGRAM:
                return 10000;
            case GRAM:
                return 10000;
            case KILOGRAM:
                return 10;
            case MILLILITER:
                return 10000;
            case LITER:
                return 10;
            case TEASPOON:
                return 100;
            case TABLESPOON:
                return 100;
            case CUP:
                return 100;
            case OUNCE:
                return 100;
            case POUND:
                return 100;
            case NONE:
                return 0;
        }

        return 0;
    }

    public void updateAlertQuantity(int progress)
    {
        ingredient.setAlertQuantity(progress);
        //Repo should save
    }
}
