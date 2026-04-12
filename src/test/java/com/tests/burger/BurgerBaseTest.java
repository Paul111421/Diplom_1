package com.tests.burger;

import praktikum.Bun;
import praktikum.Burger;
import praktikum.Database;
import praktikum.Ingredient;

import java.util.List;

public class BurgerBaseTest {

    Burger burgerForTest = new Burger();

    Database databaseForBurger = new Database();
    List<Bun> bunsForTest = databaseForBurger.availableBuns();
    List<Ingredient> ingredientsForTest = databaseForBurger.availableIngredients();

}

