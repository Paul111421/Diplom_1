package com.tests.burger;

import org.mockito.Mock;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Database;
import praktikum.Ingredient;

import java.util.List;

public class BurgerBaseTest {

    @Mock
    Burger burgerForTest = new Burger();

    @Mock
    Database databaseForBurger = new Database();

    List<Bun> bunsForTest = databaseForBurger.availableBuns();
    List<Ingredient> ingredientsForTest = databaseForBurger.availableIngredients();

}

