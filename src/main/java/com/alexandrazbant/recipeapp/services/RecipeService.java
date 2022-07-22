package com.alexandrazbant.recipeapp.services;

import com.alexandrazbant.recipeapp.commands.RecipeCommand;
import com.alexandrazbant.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService{

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand findCommandById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
