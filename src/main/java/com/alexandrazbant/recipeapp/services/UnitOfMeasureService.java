package com.alexandrazbant.recipeapp.services;

import com.alexandrazbant.recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUnitOfMeasures();
}
